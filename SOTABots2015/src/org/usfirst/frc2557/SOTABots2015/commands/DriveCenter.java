package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import java.lang.Math.*;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCenter extends Command {

    public DriveCenter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveWithJoystick);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Call radar to determine which side and which degree is center.
    	float speed = 10;
    	float angl = 30;
    	float rotation = 0;
    	// call offset to calculate what degree target is what degree on gyro.
    	Robot.driveWithJoystick.mecanumDrive_Polar123(speed, angl, rotation);
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