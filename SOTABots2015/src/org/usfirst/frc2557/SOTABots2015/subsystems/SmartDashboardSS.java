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
    double center 		= RobotMap.rangeCenter.getVoltage();
    double right 		= RobotMap.rangeRight.getVoltage();
    double left 		= RobotMap.rangeLeft.getVoltage();
    double centerAvg	= RobotMap.rangeCenter.getAverageVoltage();
    double rightAvg		= RobotMap.rangeRight.getAverageVoltage();
    double leftAvg 		= RobotMap.rangeLeft.getAverageVoltage();
    double divider 		= .009765;
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
        SmartDashboard.putNumber("The Left Range Finder normal: ", left/divider);
        SmartDashboard.putNumber("The Right Range Finder normal: ", right/divider);
        SmartDashboard.putNumber("The Center Range Finder normal: ", center/divider);
        SmartDashboard.putNumber("The Left Range Finder average: ", leftAvg/divider);
        SmartDashboard.putNumber("The Right Range Finder average: ", rightAvg/divider);
        SmartDashboard.putNumber("The Center Range Finder average: ", centerAvg/divider);
        
        //Gyro
        SmartDashboard.putNumber("Gyro angle is: ",RobotMap.locationGyro.getAngle() );
        
        //Accelerometers
        SmartDashboard.putNumber("Accelerometer Y-Axis: ", RobotMap.locationAccelerometer2.getY());
        SmartDashboard.putNumber("Accelerometer X-Axis: ", RobotMap.locationAccelerometer2.getX());
    }
}

