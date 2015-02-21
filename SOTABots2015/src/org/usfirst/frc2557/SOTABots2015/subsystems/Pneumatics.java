package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    public static DoubleSolenoid grab = RobotMap.grab;		//Breakout 1; port 0 and 1
    public static DoubleSolenoid intakeSol;					//Breakout 1; port 2 and 3
    public static DoubleSolenoid ejector;					//Breakout 1; port 4 and 5
    public static DoubleSolenoid rightHook;					//Breakout 1; port 6 and 7
    public static DoubleSolenoid backHook;					//Breakout 2; port 0 and 1
    public static DoubleSolenoid leftHook;					//Breakout 2; port 2 and 3
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void grab(){
    	grab.set(Value.kForward);
    }
    public void intakeOpen(){
    	intakeSol.set(Value.kForward);
    }
    public void intakeClose(){
    	intakeSol.set(Value.kReverse);
    }
    public void eject(){
    	ejector.set(Value.kForward);
    }
    public void back(){
    	backHook.set(Value.kForward);
    }
    public void left(){
    	leftHook.set(Value.kForward);
    }
    public void dropAllBins(){
    	rightHook.set(Value.kReverse);
    	leftHook.set(Value.kReverse);
    	backHook.set(Value.kReverse);
    }
    public void right(){
    	rightHook.set(Value.kForward);
    }
    public void release(){
    	grab.set(Value.kReverse);
    }
}

