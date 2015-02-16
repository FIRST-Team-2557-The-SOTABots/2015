package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftDown extends Command {
	
	int currentLevel; //Makes a variable for the current level
	boolean done; //Makes a variable for finish
	int minLevel = RobotMap.minLiftLevel; //Sets the min level variable

    public LiftDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator); //Uses the manipulator subsystem
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	done = false; //Sets the finish boolean
    	currentLevel = RobotMap.liftLevel; //Sets the current level
    	Robot.manipulator.liftDown(); //Starts the lift
    	//Makes sure we are not bottomed out
    	if(currentLevel == minLevel){
    		end();
    		done = true;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Waits until we reach the next level
    	if(currentLevel > RobotMap.liftLevel){
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
    	Robot.manipulator.liftStop(); //Stops the lift
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
