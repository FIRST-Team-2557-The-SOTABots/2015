package org.usfirst.frc2557.SOTABots2015.subsystems;

import org.usfirst.frc2557.SOTABots2015.Robot;
import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SmartDashboardSS extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void smartDashboardOutputs() {
        //Limit Switch
        if(RobotMap.momentarySwitch.equals(true)){
            SmartDashboard.putString("Limit Switch", "ON");
        }
        else{
            SmartDashboard.putString("Limit Switch", "OFF");
        }
        //RangeFinders
        SmartDashboard.putNumber("The Front Left Range Finder is seeing", RobotMap.rangeLeft.getVoltage());
        SmartDashboard.putNumber("The Right Range Finder is seeing", RobotMap.rangeRight.getVoltage()/.009765);
        SmartDashboard.putNumber("The Center Range Finder is seeing", RobotMap.rangeCenter.getVoltage()/.009765);
        SmartDashboard.putNumber("The Left Range Finder is seeing an average range of ", RobotMap.rangeLeft.getAverageVoltage());
        SmartDashboard.putNumber("The Right Range Finder is seeing an average range of", RobotMap.rangeRight.getAverageVoltage()/.009765);
        SmartDashboard.putNumber("The Center Range Finder is seeing an average range of", RobotMap.rangeCenter.getAverageVoltage()/.009765);
        
        //Gyro
        SmartDashboard.putNumber("Gyro angle is: ",RobotMap.locationGyro.getAngle() );
        
        //Accelerometers
        SmartDashboard.putNumber("Accelerometer Y-Axis: ", RobotMap.locationAccelerometer2.getY());
        SmartDashboard.putNumber("Accelerometer X-Axis: ", RobotMap.locationAccelerometer2.getX());
    }
}

