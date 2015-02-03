package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroSub extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driftProblem() {
    	double initial = RobotMap.locationGyro.getAngle();
    	double rate = RobotMap.locationGyro.getRate();
    }
    
    public double getAngle(){
    	return RobotMap.locationGyro.getAngle();
    }
    
    public void reset(){
    	RobotMap.locationGyro.reset();
    }
}

