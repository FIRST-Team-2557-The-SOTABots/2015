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
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double gyro = Math.abs(RobotMap.locationGyro.getAngle()) % 360;
//    	if (Robot.oi.XboxController.getRawButton(7)){
//    		gyro = RobotMap.locationGyro.getAngle();
//    	}
//    	if (Robot.oi.XboxController.getRawButton(8)){
//    		gyro = 0;
//    	}
    	//RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-Robot.oi.XboxController.getRawAxis(1), -Robot.oi.XboxController.getRawAxis(0), -Robot.oi.XboxController.getRawAxis(4), RobotMap.locationGyro.getAngle());
//Joystick Controller
    	//if (Math.abs(Robot.oi.rightJoystick.getX()) > 0.15 || Math.abs(Robot.oi.rightJoystick.getY()) >  0.15 || Math.abs(Robot.oi.rightJoystick.getZ()) > .15){
    	//	RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(Robot.oi.rightJoystick.getX(), Robot.oi.rightJoystick.getY(), Robot.oi.rightJoystick.getZ(), 0);//RobotMap.locationGyro.getAngle()*1.3);
    	//}Robot.oi.rightJoystick.getZ()
//    	else{
//    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,0,0,0);
//    	}
//}
//Xbox Controller
//    	if (Math.abs(-Robot.oi.XboxController.getRawAxis(1)) > 0.3 || Math.abs(-Robot.oi.XboxController.getRawAxis(0)) > 0.3 || Math.abs(-Robot.oi.XboxController.getRawAxis(4)) > .3){
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-Robot.oi.XboxController.getRawAxis(0)*.5, -Robot.oi.XboxController.getRawAxis(1)*.5, -Robot.oi.XboxController.getRawAxis(4)*.5,gyro);
//    	}
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
//
//if (Math.abs(leftStick.getAxis(Joystick.AxisType.kX)) > 0.15)   {        
//    drive.arcadeDrive(leftStick);
//}
//else if (Math.abs(leftStick.getAxis(Joystick.AxisType.kY)) > 0.15) {
//    drive.arcadeDrive(leftStick);
//}
//else{
//    drive.arcadeDrive(0,0);
//}