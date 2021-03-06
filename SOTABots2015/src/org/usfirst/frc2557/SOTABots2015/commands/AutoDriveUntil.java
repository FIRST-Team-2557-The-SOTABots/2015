package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveUntil extends Command {
	private double power;
	private double strafe;
	private double rotate;
    public AutoDriveUntil(double x, double y, double z) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	power = y;
    	strafe = x;
    	rotate = z;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveWithJoystick.mecanumDrive_Cartesian123(strafe,power,rotate,0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return RobotMap.toteStop.get() == true;
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
