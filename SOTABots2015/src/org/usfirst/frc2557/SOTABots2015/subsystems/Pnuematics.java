package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnuematics extends Subsystem {
    public static DoubleSolenoid grab = RobotMap.grab;								//Breakout 1; port 0 and 1
    public static DoubleSolenoid intakeSol = RobotMap.intakeSol;					//Breakout 1; port 2 and 3
    public static DoubleSolenoid ejector = RobotMap.ejector;						//Breakout 1; port 4 and 5
    public static DoubleSolenoid rightHook = RobotMap.rightHook;					//Breakout 1; port 6 and 7
    public static DoubleSolenoid backHook = RobotMap.backHook;						//Breakout 2; port 0 and 1
    public static DoubleSolenoid leftHook = RobotMap.leftHook;						//Breakout 2; port 2 and 3
    public static boolean grabbool = false;
    public static boolean intakebool = false;
    public static boolean backbool = false;
    public static boolean leftbool = false;
    public static boolean rightbool = false;
    public static boolean ejectbool = true;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    } 
    
    public void grab(){
    	if(grabbool){
	    	grab.set(Value.kForward);
	    	grabbool = false;
    	}else{
    		grab.set(Value.kReverse);
    		grabbool = true;
    	}
    }
    
    public void intake(){
    	if(intakebool){
    		intakeSol.set(Value.kForward);
    		intakebool = false;
    	}else{
    		intakeSol.set(Value.kReverse);
    		intakebool = true;
    	}
    }
    
    public void eject(){
    	if(ejectbool){
    		ejector.set(Value.kForward);
    		ejectbool = false;
    	}else{
    		ejector.set(Value.kReverse);
    		ejectbool = true;
    	}
    }
    
    public void back(){
    	if(backbool){
    		backHook.set(Value.kForward);
    		backbool = false;
    	}else{
    		backHook.set(Value.kReverse);
    		backbool = true;
    	}
    }
    
    public void left(){
    	if(leftbool){
    		leftHook.set(Value.kForward);
    		leftbool = false;
    	}else{
    		leftHook.set(Value.kReverse);
    		leftbool = true;
    	}
    }
    
    public void right(){
    	if(rightbool){
    		rightHook.set(Value.kForward);
    		rightbool = false;
    	}else{
    		rightHook.set(Value.kReverse);
    		rightbool = true;
    	}
    }
    public void init(){
    	grab.set(Value.kReverse);
    	grabbool =  true;
    	intakeSol.set(Value.kReverse);
    	intakebool =  true;
    	ejector.set(Value.kForward);
    	ejectbool = false;
    	backHook.set(Value.kReverse);
    	backbool = true;
    	leftHook.set(Value.kReverse);
    	leftbool = false;
    	rightHook.set(Value.kReverse);
    	rightbool =  false;
    }
}

