package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CheckLiftLevel extends Command {
	
	boolean inTransit;

    public CheckLiftLevel() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.hallEffect);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	inTransit = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(inTransit){
    		if(RobotMap.liftMovingUp){
    			if(Robot.hallEffect.checkLift()){
    				RobotMap.liftLevel++;
    			}
    		}
    		else{
    			if(Robot.hallEffect.checkLift()){
    				RobotMap.liftLevel--;
    			}
    		}
    	}
    	else{
    		if(!Robot.hallEffect.checkLift()){
    			inTransit = true;
    		}
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
