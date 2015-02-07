package org.usfirst.frc2557.SOTABots2015.subsystems;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PDPamps extends Subsystem {
	
	PowerDistributionPanel pdp = new PowerDistributionPanel();
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

     	SmartDashboard.putNumber("Front Right", pdp.getCurrent(12));
     	SmartDashboard.putNumber("Front Left", pdp.getCurrent(13));
     	SmartDashboard.putNumber("Back Right", pdp.getCurrent(14));
     	SmartDashboard.putNumber("Back Left", pdp.getCurrent(15));
     	
     	
     	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

