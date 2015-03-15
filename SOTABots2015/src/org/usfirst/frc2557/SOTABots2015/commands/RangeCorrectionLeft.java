package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RangeCorrectionLeft extends Command {
	private double lowPoint;
	private double lowPointInches;
	private double firstLength;
	private double secondLength;
	private double length;
	private double width;
	private double lowPointAngle;
	private double inchesFront;
	private double inchesLeftBack;
	private double inchesRightBack;
	private double minSweepAngle;
	private double maxSweepAngle;
	private double sweepAngle;
	private double hitInches;
	private double hitAngle;
	public boolean inRange;
	public double noHitInches;
	public double noHitAngle;
	public boolean notDone;
	public double x;
	public double z;
	public boolean widthIgnore;
	public boolean lengthIgnore;
	public double binLength;
	public boolean binIgnore;
	public boolean ig;
	public double p;
	public double firstWidth;
	public double secondWidth;
	public boolean isIncrementing;
    public RangeCorrectionLeft() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	minSweepAngle = -22 / 180;
		maxSweepAngle = 22 / 180;
		binIgnore = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	notDone = true;
    	while(notDone){
    	
    		lowPoint = 200;
    		noHitAngle = maxSweepAngle;
    		inRange = false;
    		sweepAngle = minSweepAngle;
    	while(sweepAngle <= maxSweepAngle){
    		RobotMap.servoLeft.setAngle(sweepAngle);
    		inchesFront = RobotMap.rangeLeft.getVoltage()/.00765;
    		if(inchesFront < 40){
    			hitInches = inchesFront;
    			hitAngle = sweepAngle;
    			inRange = true;
    		if((Math.cos(hitAngle) / hitInches) < lowPoint){
    			lowPoint = (Math.cos(hitAngle) / hitInches);
    			lowPointAngle = sweepAngle;
    			lowPointInches = hitInches;
    			}
    		else if(inRange == true){
    			noHitInches = inchesFront;
    			noHitAngle = sweepAngle;
    			inRange = false;
    		}
    		if(sweepAngle == maxSweepAngle){
    			isIncrementing = false;
    		}
    		else if(sweepAngle == minSweepAngle){
    			isIncrementing = true;
    		}
    		if(isIncrementing == true){
    			sweepAngle += 1 / 180;
    		}
    		else{
    			sweepAngle -= 1 / 180;
    		}
    		
    		
    		
    	secondLength = Math.pow(Math.sin((hitAngle-90) / hitInches) - Math.sin((lowPointAngle-90) / lowPointInches), 2);
    	firstWidth = Math.pow(Math.cos((lowPointAngle-90) / lowPointInches) - Math.cos((noHitAngle-90) / noHitInches), 2);
    	
    	if(secondLength + firstWidth < 10 || secondLength + firstWidth > 14){
			binIgnore = true;
}
    	if(binIgnore == false){
    		maxSweepAngle = noHitAngle += 2 / 180;
    		minSweepAngle = hitAngle -= 2 / 180;
    		
    		if((hitAngle + noHitAngle) / 2 > 2){
        		x = 1;
        		// SHOULD MOVE RIGHT
        	}
        	else if((hitAngle + noHitAngle) / 2 < -2){
        		x = -1;
        		// SHOULD MOVE LEFT
    	}
    	RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(x, 0, 0, 0);
    	
    	while(RobotMap.rangeLeft.getVoltage() / .00765 < 5){
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0, 1, 0, 0);
    	}
    	RobotMap.leftHook.set(DoubleSolenoid.Value.kForward);
    		}
    	}
    	}
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
