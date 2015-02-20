package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {

    public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
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
    	while(RobotMap.frontLeftEnc.get() < 100 & RobotMap.frontRightEnc.get() < 100){
    		Robot.driveWithJoystick.mecanumDrive_Cartesian123(0,.2,0,0);
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
