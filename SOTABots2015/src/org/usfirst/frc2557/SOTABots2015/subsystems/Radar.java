//Radar
package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.NamedSendable;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	public void findCenter(double x, double y){
		double a;
		//int counter = 0;
		//double[] average = new double[3];
		//for (int i = 0; i < average.length ; i ++, counter++)
		//{
			//if(average[i] <= 185)
				a = rangeCenter.getAverageVoltage()/.009765;
			//else
				//counter--;
		//}
		//a /= counter;
//		if (average[0] <= average[1] + 3 && average[0] >= average[1] - 3){
//			a = (average[0] + average[1])/2;
//		}
//		else if (average[1] <= average[2] + 3 && average[1] >= average[2] - 3){
//			a = (average[1] + average[2])/2;
//		}
//		else if (average[2] <= average[0] + 3 && average[2] >= average[0] - 3){
//			a = (average[2] + average[0])/2;
//		}
		SmartDashboard.putNumber("We are reading: ", a);
    	RobotMap.servoCenter.set(RobotMap.degCount / 180.0);
    	if (RobotMap.sweepDir == true) {
    		RobotMap.degCount+= 2;
    	}
    	else {
    		RobotMap.degCount-= 2;
    	}
    	if (RobotMap.degCount == y) {
    		RobotMap.sweepDir = false;
    	}
    	else if (RobotMap.degCount == x) {
    		RobotMap.sweepDir = true;
    	}
//    	SmartDashboard.putNumber("Center Value is: ", rangeCenter.getVoltage()/.009765);
//    	centerArray[RobotMap.degCount] = rangeCenter.getVoltage()/.009765;
//    	SmartDashboard.putNumber("Center Array:", centerArray[RobotMap.degCount]);
    	}
///////////////////////////////////////////////////    
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

