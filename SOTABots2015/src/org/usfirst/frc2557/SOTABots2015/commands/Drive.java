package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
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
    	//RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(-Robot.oi.XboxController.getRawAxis(1), -Robot.oi.XboxController.getRawAxis(0), -Robot.oi.XboxController.getRawAxis(4), RobotMap.locationGyro.getAngle());
    	if (Robot.oi.rightJoystick.getX() > +- 0.15 || Robot.oi.rightJoystick.getY() > +- 0.15 || Robot.oi.rightJoystick.getZ() > +- .15){
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(Robot.oi.rightJoystick.getX(), -Robot.oi.rightJoystick.getY(), -Robot.oi.rightJoystick.getZ()*.5, RobotMap.locationGyro.getAngle()*1.3);
    	}
    	else{
    		RobotMap.driveTrainRobotDrive41.mecanumDrive_Cartesian(0,0,0,0);
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