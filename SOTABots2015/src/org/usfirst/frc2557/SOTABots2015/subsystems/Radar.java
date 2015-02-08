package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Radar extends Subsystem {
	AnalogInput rangeLeft = RobotMap.rangeLeft;
    AnalogInput rangeRight = RobotMap.rangeRight;
    AnalogInput rangeCenter = RobotMap.rangeCenter;
    Servo servoLeft = RobotMap.servoLeft;
	Servo servoRight = RobotMap.servoRight;
	Servo servoCenter 	= RobotMap.servoCenter;
	double[] centerArray 	= RobotMap.centerArray;
	double[] leftArray		 = RobotMap.leftArray;
	double[] rightArray 	= RobotMap.rightArray;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

//Main Radar Methods
    public void findCenter(AnalogInput rangeCenter,double x, double y, double[] centerArray ){
    	RobotMap.servoCenter.set(RobotMap.degCount / 180.0);
    	if (RobotMap.sweepDir == true) {
    		RobotMap.degCount+= 2;
    	}
    	else {
    		RobotMap.degCount-= 2;
    	}
    	if (RobotMap.degCount == 178) {
    		RobotMap.sweepDir = false;
    	}
    	else if (RobotMap.degCount == 2) {
    		RobotMap.sweepDir = true;
    	}
    }
//Servos
    public void sweepAll180(){
    	RobotMap.servoLeft.set(RobotMap.degCount / 180.0);
    	RobotMap.servoRight.set(RobotMap.degCount / 180.0);
    	RobotMap.servoCenter.set(RobotMap.degCount / 180.0);
    	if (RobotMap.sweepDir == true) {
    		RobotMap.degCount+= 2;
    	}
    	else {
    		RobotMap.degCount-= 2;
    	}
    	if (RobotMap.degCount == 178) {
    		RobotMap.sweepDir = false;
    	}
    	else if (RobotMap.degCount == 2) {
    		RobotMap.sweepDir = true;
    	}
    }
    public void sweepHalf(){
        RobotMap.servoLeft.set(RobotMap.degCount / 180.0);
       	RobotMap.servoRight.set(RobotMap.degCount / 180.0);
       	RobotMap.servoCenter.set(RobotMap.degCount / 180.0);
       	if (RobotMap.sweepDir == true) {
       		RobotMap.degCount+= 2;
       	}
       	else {
       		RobotMap.degCount-= 2;
       	}
       	if (RobotMap.degCount == 135) {
       		RobotMap.sweepDir = false;
       	}
       	else if (RobotMap.degCount == 45) {
       		RobotMap.sweepDir = true;
       	}
    }
    
//Range Finders
    public double getRangeFrontLeft(){
    	return rangeLeft.getAverageVoltage();
    }
    
    public double getRangeFrontRight(){
    	return rangeRight.getAverageVoltage();
    }
    
    public double getRangeBack(){
    	return rangeCenter.getAverageVoltage();
    }
}

