package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulator extends Subsystem {
    
	SpeedController intake 	= RobotMap.intakeMotors;
	SpeedController lift 		= RobotMap.liftMotor;
	double liftSpd = RobotMap.liftSpeed;
	double intakeSpd = RobotMap.intakeSpeed;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void liftUp(){
    	lift.set(liftSpd);
    }
    public void liftDown(){
    	lift.set(-liftSpd);
    }
    public void liftStop(){
    	lift.set(0);
    }
    public void lift(){
    	lift.set(-Robot.oi.XboxController2.getRawAxis(1));
    }
    public void intakeIn(){
    	intake.set(intakeSpd);
    }
    public void intakeOut(){
    	intake.set(intakeSpd);
    }
    public void intakeStop(){
    	intake.set(0);
    }
    public void intake(){
    	intake.set(Robot.oi.XboxController2.getRawAxis(5));
    }
    
}

