package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RFArray extends Command {

	public double n0;
	public double n1;
	public double n2;
	public double n3;
	public double n4;
	public double n5;
	public double n6;
	public double n7;
	public double n8;
	public double n9;
	public double n10;
	public double n11;
	public double n12;
	public double n13;
	public double n14;
	public double n15;
	public double n16;
	public double n17;
	public double n18;
	public double n19;
	public double n20;
	public double n21;
	public double n22;
    public RFArray() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(RobotMap.servoCenter.getAngle() == 68){
    		n0 = RobotMap.rangeCenter.getVoltage() / .00765;
    	RobotMap.rfDetails[68] = n0;
    	}
    	while(RobotMap.servoCenter.getAngle() == 70){
    		n1 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[70] = n1;
    	}
    	while(RobotMap.servoCenter.getAngle() == 72){
    		n2 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[72] = n2;
    	}
    	while(RobotMap.servoCenter.getAngle() == 74){
    		n3 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[74] = n3;
    	}
    	while(RobotMap.servoCenter.getAngle() == 76){
    		n4 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[76] = n4;
    	}
    	while(RobotMap.servoCenter.getAngle() == 78){
    		n5 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[78] = n5;
    	}
    	while(RobotMap.servoCenter.getAngle() == 80){
    		n6 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[80] = n6;
    	}
    	while(RobotMap.servoCenter.getAngle() == 82){
    		n7 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[82] = n7;
    	}
    	while(RobotMap.servoCenter.getAngle() == 84){
    		n8 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[84] = n8;
    	}
    	while(RobotMap.servoCenter.getAngle() == 86){
    		n9 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[86] = n9;
    	}
    	while(RobotMap.servoCenter.getAngle() == 88){
    		n10 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[88] = n10;
    	}
    	while(RobotMap.servoCenter.getAngle() == 90){
    		n11 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[90] = n11;
    	}
    	while(RobotMap.servoCenter.getAngle() == 92){
    		n12 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[92] = n12;
    	}
    	while(RobotMap.servoCenter.getAngle() == 94){
    		n13 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[94] = n13;
    	}
    	while(RobotMap.servoCenter.getAngle() == 96){
    		n14 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[96] = n14;
    	}
    	while(RobotMap.servoCenter.getAngle() == 98){
    		n15 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[98] = n15;
    	}
    	while(RobotMap.servoCenter.getAngle() == 100){
    		n16 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[100] = n16;
    	}
    	while(RobotMap.servoCenter.getAngle() == 102){
    		n17 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[102] = n17;
    	}
    	while(RobotMap.servoCenter.getAngle() == 104){
    		n18 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[104] = n18;
    	}
    	while(RobotMap.servoCenter.getAngle() == 106){
    		n19 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[106] = n19;
    	}
    	while(RobotMap.servoCenter.getAngle() == 108){
    		n20 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[108] = n20;
    	}
    	while(RobotMap.servoCenter.getAngle() == 110){
    		n21 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[110] = n21;
    	}
    	while(RobotMap.servoCenter.getAngle() == 112){
    		n22 = RobotMap.rangeCenter.getVoltage() / .00765;
    		RobotMap.rfDetails[112] = n22;
    	}
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

