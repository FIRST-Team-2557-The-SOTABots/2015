package org.usfirst.frc2557.SOTABots2015.commands;

import org.usfirst.frc2557.SOTABots2015.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
//    	addSequential(new BackHook());
     	addSequential(new AutoDrive(0, .2, 0, 1500)); //has to change
    	addSequential(new AutoDrive(0, -.2, 0, 1500));
//    	addParallel(new Intake());
    	addSequential(new AutoIntake());
//    	addSequential(new Intake());
//    	addSequential(new Grab());
    	addSequential(new AutoLiftUp());
//    	addSequential(new AutoRotateCounter());
//    	addSequential(new RightHook());
//    	addSequential(new AutoRotateCounter());
//    	addSequential(new AutoDrive()); //Drive Forwards
//    	addSequential(new Intake());
    	addSequential(new AutoIntake());
//    	addSequential(new Intake());
    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
    	addSequential(new AutoLiftUp());
//    	addSequential(new AutoDrive(0, -.2, 0, 1500)); //Backwards
//    	addSequential(new AutoDrive(0, 0, -.2, 1500)); //Rotate left
//    	addSequential(new AutoDrive(0, 0, -.2, 1500)); //Rotate left
//    	addSequential(new Intake());
//    	addSequential(new AutoIntake());
//    	addSequential(new Intake());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new AutoRotateClock());
//    	addSequential(new LeftHook());
//    	addSequential(new AutoDrive(0, .2, 0, 1500)); //Drive Forward
//    	addSequential(new AutoLiftDown());
//    	addSequential(new Grab());
//    	addSequential(new Eject());
//    	addSequential(new AutoDrive(0, -.2, 0, 1500)); //Drive backwards

    }
}
