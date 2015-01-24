package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GetAverageRange extends Command {

    public GetAverageRange() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("The Left Range Finder is seeing an average range of ", RobotMap.rangeFrontLeft.getAverageVoltage()/.009765);
    	SmartDashboard.putNumber("The Right Range Finder is seeing an average range of", RobotMap.rangeFrontRight.getAverageVoltage()/.009765);
		SmartDashboard.putNumber("The Back Range Finder is seeing an average range of", RobotMap.rangeBack.getAverageVoltage()/.009765);

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
