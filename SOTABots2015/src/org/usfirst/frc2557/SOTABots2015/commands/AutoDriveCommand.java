package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveCommand extends Command {
	private double x;
	private double y;
	private double rotation;
	private double gyroAngle;
	
    int A = RobotMap.frontLeftEnc.get();
    int B = RobotMap.frontRightEnc.get();
    int C = RobotMap.rearLeftEnc.get();
    int D = RobotMap.rearRightEnc.get();
    public int E;
    public AutoDriveCommand(double x1, double y1, double rotation1, double gyroAngle1, int E) {
    	this.x = x1;
    	this.y = y1;
    	this.rotation = rotation1;
    	this.gyroAngle = gyroAngle1;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while (A < E && B < E && C < E && D < E){
			RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(this.x, this.y, this.rotation,this.gyroAngle);
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
