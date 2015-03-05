package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RangeCorrectionAuto2 extends Command {
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

    public RangeCorrectionAuto2(boolean ig, double p) {
       	this.ig = ig;
    	this.p = p;
    	
    	inchesFront = RobotMap.rangeCenter.getVoltage()/.009765;
    	inchesLeftBack = RobotMap.rangeLeft.getVoltage()/.009765;
    	inchesRightBack = RobotMap.rangeRight.getVoltage()/.009765;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	minSweepAngle = -22 / 180;
		maxSweepAngle = 22 / 180;
		widthIgnore = false;
		lengthIgnore = false;
		binIgnore = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	notDone = true;
    	while(notDone == true){
    	
    		lowPoint = 200;
    		noHitAngle = maxSweepAngle;
    		inRange = false;
    		sweepAngle = minSweepAngle;
    	while(sweepAngle <= maxSweepAngle){
    		RobotMap.servoCenter.setAngle(sweepAngle);
    		inchesFront = RobotMap.rangeCenter.getVoltage()/.00765;
    		if(inchesFront < 20){
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
    		
    		sweepAngle += 1 / 180;
    	}
    		
    		
    		// Find length
    		firstLength = Math.pow(Math.cos((hitAngle-90) / hitInches) - Math.cos((lowPointAngle-90) / lowPointInches), 2);
    		secondLength = Math.pow(Math.sin((hitAngle-90) / hitInches) - Math.sin((lowPointAngle-90) / lowPointInches), 2);
    		length = Math.sqrt(firstLength + secondLength);
    		firstLength = Math.pow(Math.cos((lowPointAngle-90) / lowPointInches) - Math.cos((noHitAngle-90) / noHitInches), 2);
    		secondLength = Math.pow(Math.sin((lowPointAngle-90) / lowPointInches) - Math.sin((noHitAngle-90) / noHitInches), 2);
    		width = Math.sqrt(firstLength + secondLength);
    		
    		/*
    		 * if width gt length we have the long side, swap
    		 */
    		if(width >= length){
    			length = width;
    		}

    		/*
    		 * if is not the size of either the long or the short side ignore
    		 * if within 18-24 this is the short side
    		 */
    		if(width < 17 || width > 21){
    			widthIgnore = true;
    			}
    		else if(length < 18 || length > 24){
    			lengthIgnore = true;
    		}
    		else if(binLength < 10 || binLength > 14){
    			binIgnore = true;
    		}
    		if(!lengthIgnore && !widthIgnore){
    			lengthIgnore = true;
    		}
    		if(hitInches - noHitInches < 5){
    			widthIgnore = true;
    		}
    		}
    	    }
    			//move towards width

    	// Checking for the midpoint of the object using the servo angle
    	
    	x = 0;
    	z = 0;
    	
    	if(widthIgnore == false && noHitInches - lowPointInches >= 2){
    		z = 1;
    	}
    	else{
    		z = -1;
    	}
    		
    		
    	if((hitAngle + noHitAngle) / 2 > 2){
    		x = 1;
    		// SHOULD MOVE RIGHT
    	}
    	else if((hitAngle + noHitAngle) / 2 < -2){
    		x = -1;
    		// SHOULD MOVE LEFT
    	}
    	if(lengthIgnore == false && hitInches >  noHitInches){
    		z = -1;
    		x = -1;
    		while(!widthIgnore){
    			RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(x, 0, z, 0);
    			
    		}
    	}
    	else if(lengthIgnore == false && noHitInches > hitInches){
    		z = 1;
    		x = 1;
    		while(!widthIgnore){
    			RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(x, 0, z, 0);
    		}
    		
    		}
    	

    	
    		
    	RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(x,0,z,0);
    	
    	if(((Math.abs(hitAngle + noHitAngle) / 2) < 2) && (Math.abs(hitInches - noHitInches) < 2)){

    		while(!RobotMap.toteStop.get()){
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,1,0,0);
    		}
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,0,0,0);
    		while(!ig){
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0, 0, p, 0);
    	}
    		if(ig){
    		RobotMap.driveTrainBackLeft.set(1);
    		RobotMap.driveTrainBackRight.set(1);
    		RobotMap.driveTrainFrontLeft.set(1);
    		RobotMap.driveTrainFrontRight.set(1);
    		}
    		if(RobotMap.rangeCenter.getVoltage() / .00765 < 10){
    			RobotMap.intakeSol.set(DoubleSolenoid.Value.kForward);
    			while(!RobotMap.toteStop.get() && RobotMap.intakeSol.get() == DoubleSolenoid.Value.kForward){
        			RobotMap.intakeMotors.set(1);
    			}
              		RobotMap.grab.set(DoubleSolenoid.Value.kForward);
              		RobotMap.time.reset();
            		while(RobotMap.time.get() < 2){
            		RobotMap.liftMotor.set(1);
            		}
    			
    		}
    		
    		}
    		notDone = false;
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
