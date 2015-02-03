package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class EncoderSub extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Encoder frontLeftEncoder = RobotMap.frontLeftEnc;
	Encoder frontRightEncoder = RobotMap.frontRightEnc;
	Encoder rearLeftEncoder = RobotMap.rearLeftEnc;
	Encoder rearRightEncoder = RobotMap.rearRightEnc;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void updateDashboard(){
    	SmartDashboard.putNumber("front left enc", frontLeftEncoder.get());
    	SmartDashboard.putNumber("front right enc", frontRightEncoder.get());
    	SmartDashboard.putNumber("rear left enc", rearLeftEncoder.get());
    	SmartDashboard.putNumber("rear right enc", rearRightEncoder.get());
    }
}

