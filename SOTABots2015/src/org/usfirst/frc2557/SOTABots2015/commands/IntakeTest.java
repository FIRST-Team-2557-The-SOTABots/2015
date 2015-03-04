package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
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
  //  	Robot.manipulator.intake();
    	if (Robot.oi.gamepad1.getRawAxis(2) > 0.05){
    		RobotMap.intakeMotors.set(-1);
    	}
    	else if (Robot.oi.gamepad1.getRawAxis(3) > 0.05){
    		RobotMap.intakeMotors.set(1);
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
    	RobotMap.intakeSol.set(Value.kForward);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
