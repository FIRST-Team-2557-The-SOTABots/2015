package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoDrive extends Command {
	private double power;
	private double distance;
    public AutoDrive(double x, double y) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	power = x;
    	distance = y;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.frontLeftEnc.reset();
    	RobotMap.frontRightEnc.reset();
    	RobotMap.rearLeftEnc.reset();
    	RobotMap.rearRightEnc.reset();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(RobotMap.frontLeftEnc.get() < distance & RobotMap.frontRightEnc.get() < distance){
    		Robot.driveWithJoystick.mecanumDrive_Cartesian123(0,power,0,0);
    		SmartDashboard.putNumber("front left enc", RobotMap.frontLeftEnc.get());
        	SmartDashboard.putNumber("front right enc", RobotMap.frontRightEnc.get());
        	SmartDashboard.putNumber("rear left enc", RobotMap.rearLeftEnc.get());
        	SmartDashboard.putNumber("rear right enc", RobotMap.rearRightEnc.get());
        	SmartDashboard.putNumber("front left dist", RobotMap.frontLeftEnc.getDistance());
        	SmartDashboard.putNumber("front left rate", RobotMap.frontLeftEnc.getRate());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveWithJoystick.mecanumDrive_Cartesian123(0,0,0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	
}
