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
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void sweep180(){
	    while( RobotMap.degCount < 180){
	    	servoLeft.setAngle(RobotMap.degCount);
	    	servoRight.setAngle(RobotMap.degCount);
	    	servoCenter.setAngle(RobotMap.degCount);
	    	RobotMap.degCount ++;
	    }
    }
	public void sweep0(){
	    while( RobotMap.degCount > 0){
	    	servoLeft.setAngle(RobotMap.degCount);
	    	servoRight.setAngle(RobotMap.degCount);
	    	servoCenter.setAngle(RobotMap.degCount);
	    	RobotMap.degCount --;
	    }
    }
    /* Is this supposed to be here?
     * public void sweep() throws InterruptedException{
    	RobotMap.servoLeft.set(1);
    	Timer.delay(1);
    	RobotMap.servoLeft.set(0);
    	Timer.delay(1);
    }
    */
}

