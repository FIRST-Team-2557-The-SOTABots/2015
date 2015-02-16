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



import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
//   public AtomicInteger degCount = new AtomicInteger(1);
	
	//PWM's (out of 10 total ports)
	public static SpeedController driveTrainFrontLeft; 	//Port0
    public static SpeedController driveTrainFrontRight; //Port1
    public static SpeedController driveTrainBackLeft;	//Port2
    public static SpeedController driveTrainBackRight;	//Port3
    public static SpeedController liftMotor;			//Port4
    public static SpeedController intakeMotors;			//Port5
    public static Servo servoCenter;					//Port7
    public static Servo servoLeft;						//Port8
    public static Servo servoRight;						//Port9
    public static RobotDrive driveTrainRobotDrive41;	//Ports are tied into the drive train motors
    
    //Solenoids out of 8 ports (x,y) x = which breakout it is; y = port
    public static DoubleSolenoid grab;						//Breakout 1; port 0 and 1 		
    public static DoubleSolenoid intakeSol;					//Breakout 1; port 2 and 3 		
    public static DoubleSolenoid ejector;					//Breakout 1; port 4 and 5 	
    public static DoubleSolenoid rightHook;					//Breakout 1; port 6 and 7
    public static DoubleSolenoid backHook;					//Breakout 2; port 0 and 1
    public static DoubleSolenoid leftHook;					//Breakout 2; port 2 and 3
    //public static Compressor compressor;
    
    public static BuiltInAccelerometer accelerometer; //Has no port due to being built in
    
    //Analog out of 4 total ports
    public static Gyro gyro;							//Port0
    public static AnalogInput rangeLeft;				//Port1
    public static AnalogInput rangeRight;				//Port2
    public static AnalogInput rangeCenter;				//Port3
    
    //Digital IO out of 10 total ports
    public static Counter frontLeftEnc;					//Port0
    public static Counter frontRightEnc;				//Port1
    public static Counter rearLeftEnc;					//Port2
    public static Counter rearRightEnc;					//Port3
    public static DigitalInput toteStop;				//Port4	
    public static DigitalInput liftSensor;				//Port5 
    public static DigitalInput leftRampSensor;			//Port6
    public static DigitalInput rightRampSensor;			//Port7
    public static DigitalInput binStopRear;				//Port8
    
    //Variables
    public static boolean sweepDir;
    public static int degCount;
    public static double centerDegreeR;
    public static double changeDegreeR;
    public static double centerDegreeL;
    public static double changeDegreeL;
    public static int liftLevel;
    public static double liftSpeed;
    public static double intakeSpeed;
    public static double intakeWaitTime;
    
    //Range Finder Arrays
    public static double[] leftArray;
    public static double[] centerArray;
    public static double[] rightArray;
    
    //Other
    public static PowerDistributionPanel PDP;
    public static Timer time;
    
    
    //public static AnalogInput rangeFrontRight;
    public static void init() {
    	liftMotor = new Talon(4);
    	intakeMotors = new Talon(5);
    	
    	
		driveTrainFrontLeft = new Talon(0);
		LiveWindow.addActuator("DriveTrain", "FrontLeft", (Talon) driveTrainFrontLeft);
		
		driveTrainFrontRight = new Talon(1);
		LiveWindow.addActuator("DriveTrain", "FrontRight", (Talon) driveTrainFrontRight);
		
		driveTrainBackLeft = new Talon(2);
		LiveWindow.addActuator("DriveTrain", "BackLeft", (Talon) driveTrainBackLeft);
		
		driveTrainBackRight = new Talon(3);
		LiveWindow.addActuator("DriveTrain", "BackRight", (Talon) driveTrainBackRight);
	    
	    driveTrainRobotDrive41 = new RobotDrive(driveTrainFrontLeft, driveTrainBackLeft,
	    		driveTrainFrontRight, driveTrainBackRight);
	    driveTrainRobotDrive41.setSafetyEnabled(false);
	    SmartDashboard.putBoolean("Safety= ",  driveTrainRobotDrive41.isSafetyEnabled());
	   
	    //Solenoids
	    grab = new DoubleSolenoid(1, 0, 1);
	    intakeSol = new DoubleSolenoid(1, 2, 3);
	    ejector = new DoubleSolenoid(1, 4, 5);
	    rightHook = new DoubleSolenoid(1, 6, 7);
	    backHook = new DoubleSolenoid(0, 0, 1);
	    leftHook = new DoubleSolenoid(0, 2, 3);
	    //compressor = new Compressor(0);
	    
	    
	    
	    //Variables
	    degCount = 0;
	    sweepDir = true;
	    liftLevel = 0;
	    liftSpeed = 1;
	    intakeSpeed = 1;
	    intakeWaitTime = 2;
	  
	    //Range Finders
	    rangeLeft = new AnalogInput(1);
	    rangeRight = new AnalogInput(2);
	    rangeCenter = new AnalogInput(3);
	  
	    //Servos for the RangeFinders
	    servoRight = new Servo(9);
	    servoLeft = new Servo(8);
	    servoCenter = new Servo(7);
	
	    //Gyro Ports & Sensitivity
	    gyro = new Gyro(0);
	    gyro.reset();
	    LiveWindow.addSensor("Location", "Gyro", gyro);
	    accelerometer = new BuiltInAccelerometer();
	
	    //Drive Train Sensitivity, Max Output, and Inversions
	    driveTrainRobotDrive41.setSafetyEnabled(true);
	    driveTrainRobotDrive41.setExpiration(0.1);
	    driveTrainRobotDrive41.setSensitivity(0.5);
	    driveTrainRobotDrive41.setMaxOutput(1.0);
	    driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
	    driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
	    
	    //Encoders & other Digital IO
	    toteStop = new DigitalInput(4);
	    liftSensor = new DigitalInput(5);
	    leftRampSensor = new DigitalInput(6);
	    rightRampSensor = new DigitalInput(7);
	    binStopRear = new DigitalInput(8);
	    
	  
	  	//References for what to set on the encoders. do not touch.
	    //final double MAX_PERIOD = 0.1;
	    //final int MIN_RATE = 10;
	    //final int DISTANCE_PER_PULSE = 5;
	    //final boolean REVERSE_DIRECTION = true;
	    //final int SAMPLES_TO_AVERAGE = 7;
	    
	    frontLeftEnc = new Counter(0);
	    frontLeftEnc.setMaxPeriod(.1);
	    frontLeftEnc.setUpdateWhenEmpty(true);
	    frontLeftEnc.setReverseDirection(false);
	    frontLeftEnc.setSamplesToAverage(10);
	    frontLeftEnc.setDistancePerPulse(12);
	           
	    
	    frontRightEnc = new Counter(1);
	    frontRightEnc.setMaxPeriod(.1);
	    frontRightEnc.setUpdateWhenEmpty(true);
	    frontRightEnc.setReverseDirection(false);
	    frontRightEnc.setSamplesToAverage(10);
	    frontRightEnc.setDistancePerPulse(12);
	    
	    rearLeftEnc = new Counter(2);
	    rearLeftEnc.setMaxPeriod(.1);
	    rearLeftEnc.setUpdateWhenEmpty(true);
	    rearLeftEnc.setReverseDirection(false);
	    rearLeftEnc.setSamplesToAverage(10);
	    rearLeftEnc.setDistancePerPulse(12);
	    
	    rearRightEnc = new Counter(3);
	    rearRightEnc.setMaxPeriod(.1);
	    rearRightEnc.setUpdateWhenEmpty(true);
	    rearRightEnc.setReverseDirection(false);
	    rearRightEnc.setSamplesToAverage(10);
        rearRightEnc.setDistancePerPulse(12);
	    
        //Other
        time.start();
	   
    }
}
