package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeTest extends Command {

    public IntakeTest() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	Robot.manipulator.intake();
    	if (Robot.oi.XboxController1.getRawAxis(2) < 0){
    		RobotMap.intakeMotors.set(Robot.oi.XboxController1.getRawAxis(2));
    	}
    	else if (Robot.oi.XboxController1.getRawAxis(3) < 0){
    		RobotMap.intakeMotors.set(Robot.oi.XboxController1.getRawAxis(3));
    	}
    	else{
    		RobotMap.intakeMotors.set(0);
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
