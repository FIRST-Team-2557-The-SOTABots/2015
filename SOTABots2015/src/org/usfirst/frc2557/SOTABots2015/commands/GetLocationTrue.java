package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GetLocationTrue extends Command {
	double[] aDistance = RobotMap.aDistance;
	 public double xcelx = RobotMap.accelerometer.getX();
	    public double xcely = RobotMap.accelerometer.getY();
	    public double Y= 0, YdistancePrev= 0, XdistancePrev= 0, X= 0;
	    public double Xvelocity= 0, XvelocityPrev= 0, Yvelocity= 0, YvelocityPrev= 0;
	    public double timePrev= 0, timeCurrent= 0;
	    public double timeDelta;
    public GetLocationTrue(){
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	  //Set previous values
        timePrev = timeCurrent;
        XdistancePrev = X;
        YdistancePrev = Y;
        XvelocityPrev = Xvelocity;
        YvelocityPrev = Yvelocity;
       
        //Get current acceleration values
        //Convert from G-Force to Feet Per Second Squared
        xcelx = RobotMap.accelerometer.getX() * 32.17404855561;
        xcely = RobotMap.accelerometer.getY() * 32.17404855561;
        //Get current time
        timeCurrent = RobotMap.time.get();
        timeDelta = timeCurrent - timePrev;
        
        //Calculate current velocity
        Xvelocity = xcelx * timeDelta + XvelocityPrev;
        Yvelocity = xcely * timeDelta + YvelocityPrev;
        
        //Calculate current distance
        aDistance[0] = Xvelocity * timeDelta + XdistancePrev;
        aDistance[1] = Yvelocity * timeDelta + YdistancePrev;

        SmartDashboard.putNumber("The current Y-axis acceleration is ", xcely);
        SmartDashboard.putNumber("The current X-axis acceleration is " , xcelx);
        SmartDashboard.putNumber("The current X-axis distance is " , X);
        SmartDashboard.putNumber("The current Y-axis distance is " , Y);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
