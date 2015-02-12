package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LightSensor extends Subsystem {
    
	public DigitalInput left = RobotMap.leftLightSensor;
	public DigitalInput right = RobotMap.rightLightSensor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean checkLeft(){
    	return left.get();
    }
    
    public boolean checkRight(){
    	return right.get();
    }
}

