package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeOut extends Command {
	
	boolean done; //boolean for finishing
	double wait = RobotMap.intakeWaitTime; //looking for the wait timer on the intake
	double targetTime; //variable for target time to wait

    public IntakeOut() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.manipulator); //Uses the manipulator subsystem
    	requires(Robot.momentary); //Uses the momentary subsystem
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	done = false; //sets the finish boolean to false
    	Robot.manipulator.intakeOut(); //Starts intake
    	targetTime = RobotMap.time.get() + wait; //Sets timer
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Waits for time
    	if(RobotMap.time.get() <= targetTime){
    		done = true;
    	}
    	else{
    		done = false;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.manipulator.intakeStop(); //Stops the intake
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
