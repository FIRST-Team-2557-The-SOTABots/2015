package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnuematics extends Subsystem {
    public static DoubleSolenoid grab = RobotMap.grab;		//Breakout 1; port 0 and 1
    public static DoubleSolenoid intakeSol;					//Breakout 1; port 2 and 3
    public static DoubleSolenoid ejector;						//Breakout 1; port 4 and 5
    public static DoubleSolenoid rightHook;					//Breakout 1; port 6 and 7
    public static DoubleSolenoid backHook;					//Breakout 2; port 0 and 1
    public static DoubleSolenoid leftHook;					//Breakout 2; port 2 and 3
    Value Off, Forward, Reverse;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void grab(){
    	grab.set(Forward);
    }
    public void intake(){
    	intakeSol.set(Forward);
    }
    public void eject(){
    	ejector.set(Forward);
    }
}

