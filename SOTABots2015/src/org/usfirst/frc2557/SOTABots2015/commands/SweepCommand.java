package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SweepCommand extends Command {

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
    //	Robot.servoSub.sweepLeft();
    								//The Timer Delays are for testing purposes ONLY
    								//They MUST and WILL be taken out before competition
    	RobotMap.servoLeft.set(.35);
    	Timer.delay(.1);
    	RobotMap.servoLeft.set(.45);
    	Timer.delay(.1);

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
