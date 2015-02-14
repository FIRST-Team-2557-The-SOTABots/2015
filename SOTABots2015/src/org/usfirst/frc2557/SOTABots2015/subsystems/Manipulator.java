package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulator extends Subsystem {
    
	SpeedController intakeMotors 	= RobotMap.intakeMotors;
	SpeedController liftMotor 		= RobotMap.liftMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void lift(double x){
    	liftMotor.set(x);
    }
    public void intake(double x){
    	intakeMotors.set(x);
    }
    
}

