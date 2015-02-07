package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import java.lang.Math.*;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveWithJoystick);
    	//requires(Robot.gyroSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
//    	if (Robot.oi.XboxController.getRawButton(7)){
//    		gyro = RobotMap.locationGyro.getAngle();
//    	}
//    	if (Robot.oi.XboxController.getRawButton(8)){
//    		gyro = 0;
//    	}
 
//Xbox Controller
    	if (Math.abs(-Robot.oi.XboxController.getRawAxis(1)) > 0.3 || Math.abs(-Robot.oi.XboxController.getRawAxis(0)) > 0.3 || Math.abs(-Robot.oi.XboxController.getRawAxis(4)) > .3){

		//RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-Robot.oi.XboxController.getRawAxis(0)*.5, -Robot.oi.XboxController.getRawAxis(1)*.5, -Robot.oi.XboxController.getRawAxis(4)*.5,Robot.gyroSystem.getAngle());
		//RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-Robot.oi.XboxController.getRawAxis(0)*.5, -Robot.oi.XboxController.getRawAxis(1)*.5, -Robot.oi.XboxController.getRawAxis(4)*.5,0);
    	Robot.driveWithJoystick.mecanumDrive_Cartesian123(-Robot.oi.XboxController.getRawAxis(0), -Robot.oi.XboxController.getRawAxis(1), -Robot.oi.XboxController.getRawAxis(4),0);
    	//Robot.driveWithJoystick.mecanumDrive_Cartesian123(0,-Robot.oi.XboxController.getRawAxis(1),0,0);
    	
    	}
//    	else{
//    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,0,0,0);
//    	}
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