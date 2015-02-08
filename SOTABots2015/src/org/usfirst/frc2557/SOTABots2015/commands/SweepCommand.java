package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SweepCommand extends Command {
	boolean sweepDir = RobotMap.sweepDir;
    public SweepCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.servoSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//  	Robot.servoSub.sweep180();
//    	Robot.servoSub.sweep0();
    	RobotMap.servoLeft.set(RobotMap.degCount / 180.0);
    	RobotMap.servoRight.set(RobotMap.degCount / 180.0);
    	RobotMap.servoCenter.set(RobotMap.degCount / 180.0);
    	if (RobotMap.sweepDir == true) {
    		RobotMap.degCount+= 2;
    	}
    	else {
    		RobotMap.degCount-= 2;
    	}
    	if (RobotMap.degCount == 178) {
    		RobotMap.sweepDir = false;
    	}
    	else if (RobotMap.degCount == 2) {
    		RobotMap.sweepDir = true;
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
