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
    	//requires(Robot.servoSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	RobotMap.servoLeft.set(degCount / 180.0);
//    	if (sweepDir == true) {
//    		degCount++;
//    	}
//    	else {
//    		degCount--;
//    	}
//    	if (degCount == 179) {
//    		sweepDir = false;
//    	}
//    	else if (degCount == 1) {
//    		sweepDir = true;
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
