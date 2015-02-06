package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ServoSub extends Subsystem {
	Servo servoLeft = RobotMap.servoLeft;
	Servo servoRight = RobotMap.servoRight;
	Servo servoCenter = RobotMap.servoCenter;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	double Left = RobotMap.servoLeft.getAngle();
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
//    public void sweepLeft(){   	
//    	if (Left < 180 && RobotMap.servoLeft.get() != 0){
//    		RobotMap.servoLeft.setAngle(178);
//    	}
//    	else if (Left > 0 && RobotMap.servoLeft.get() != 180){
//    		RobotMap.servoLeft.setAngle(2);
//    	}
//    }
    public void sweep() throws InterruptedException{
    	RobotMap.servoLeft.set(1);
    	Timer.delay(1);
    	RobotMap.servoLeft.set(0);
    	Timer.delay(1);
    }
}

