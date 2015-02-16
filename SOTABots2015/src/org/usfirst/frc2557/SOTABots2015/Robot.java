// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2557.SOTABots2015;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc2557.SOTABots2015.commands.*;
import org.usfirst.frc2557.SOTABots2015.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    
	Command autonomousCommand;
    Command drive;
    Command dashboard;
    Command gyroReset;
    Command radarCommand;
    Command intake;
    

    public static OI oi;
    public static DriveTrain driveWithJoystick;
    public static GyroSub gyroSub;
    public static AccelerometerSub accelerometerSub;
    public static DigitalOutput LimitSwitch;
    public static SmartDashboardSS dashboardSub;
    public static GyroReset GyroReset;
    public static Radar radarSub;
    public static LightSensors lightSensor;
    public static Pnuematics pnuematics;
    public static Manipulator manipulator;
    public static HallEffect hallEffect;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        driveWithJoystick = new DriveTrain();

        // Create a counter to tie degrees and rangefinder collection
        // The hopes of these being declared here is so they are not instantiated inside a loop
        // Where they will keep clearing themselves.
        // Let's say true is clockwise, false is counter clockwise.
        // instantiate the command used for the autonomous period
//Subsystem Initializers (must be first)
        autonomousCommand = new AutonomousCommand();
        dashboardSub = new SmartDashboardSS();
        drive = new Drive();
        gyroSub = new GyroSub();
        accelerometerSub = new AccelerometerSub();
        radarSub = new Radar();
        lightSensor = new LightSensors();
        pnuematics = new Pnuematics();
        manipulator = new Manipulator();
        hallEffect = new HallEffect();
        
//Command Initializers (must be second)
        radarCommand = new RadarCommand();
        gyroReset = new GyroReset();
        dashboard = new Dashboard();
        
        // OI must be constructed after subsystems. If the OI creates Commands 
        //(which it very likely will), subsystems are not guaranteed to be 
        // constructed yet. Thus, their requires() statements may grab null 
        // pointers. Bad news. Don't move it.
      
//OI (must always be the last one to be initialized)  
      oi = new OI();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        gyroReset.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        gyroReset.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        drive.start();
        dashboard.start();
        radarCommand.start();
        RobotMap.intakeMotors.set(oi.XboxController2.getRawAxis(5));
        RobotMap.liftMotor.set(-oi.XboxController2.getRawAxis(1));
        // Need to create a sub here that will perform the calculations for each reading Based on the variables.

    }

//RobotMap.locationGyro.getAngle()
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
