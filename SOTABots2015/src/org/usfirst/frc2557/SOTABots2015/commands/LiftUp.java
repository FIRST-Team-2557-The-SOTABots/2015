package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftUp extends Command {
	
	int currentLevel; //Sets variable for current level
	boolean done; //Sets the finish boolean
	int maxLevel = RobotMap.maxLiftLevel; //Checks the level

    public LiftUp() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.manipulator); //Uses the manipulator subsystem
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	done = false; //Sets the finish top false
    	currentLevel = RobotMap.liftLevel; //Sets the current lift level
    	Robot.manipulator.liftUp(); //Starts the lift going up
    	//Checks to make sure we are not at the highest level
    	if(currentLevel == maxLevel){
    		end();
    		done = true;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Waits until the next level up is found
    	if(currentLevel < RobotMap.liftLevel){
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
