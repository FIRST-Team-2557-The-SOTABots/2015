package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GetRange extends Command {

    public GetRange() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.rangeSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {               
    	rangeLeft 	= Robot.rangeSub.getRangeFrontLeft();
    	rangeRight 	= Robot.rangeSub.getRangeFrontRight();
    	rangeCenter = Robot.rangeSub.getRangeBack();
//    	SmartDashboard.putNumber("The Front Left Range Finder is seeing", Robot.rangeSub.getRangeFrontLeft()/.009765);
//    	SmartDashboard.putNumber("The Front Right Range Finder is seeing", Robot.rangeSub.getRangeFrontRight()/.009765);
//    	SmartDashboard.putNumber("The Back Range Finder is seeing", Robot.rangeSub.getRangeBack()/.009765);
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
