package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RangeSub extends Subsystem {
    AnalogInput rangeFrontLeft = RobotMap.rangeFrontLeft;
    AnalogInput rangeFrontRight = RobotMap.rangeFrontRight;
    AnalogInput rangeBack = RobotMap.rangeBack;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double getRangeFrontLeft(){
    	return rangeFrontLeft.getAverageVoltage();
    }
    
    public double getRangeFrontRight(){
    	return rangeFrontRight.getAverageValue();
    }
    
    public double getRangeBack(){
    	return rangeBack.getAverageValue();
    }
}

