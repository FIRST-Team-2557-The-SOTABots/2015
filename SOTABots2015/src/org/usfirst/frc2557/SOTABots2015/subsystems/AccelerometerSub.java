package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AccelerometerSub extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	BuiltInAccelerometer locationAccelerometer2 = RobotMap.locationAccelerometer2;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

