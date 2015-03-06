package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoLiftUp extends Command {
	private int level;
    public AutoLiftUp(int x) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator);
    	requires(Robot.hallEffect);
    	level = x;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	setTimeout(2.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	Robot.manipulator.liftUp();
    	if(RobotMap.liftSensor.get() == true){
    		RobotMap.liftLevel = RobotMap.liftLevel + 1;
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
//        return count == 2;
//    	return RobotMap.liftSensor.get() == true;
//    	return Robot.hallEffect.checkLift();
    	return RobotMap.liftLevel == level;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.liftMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
