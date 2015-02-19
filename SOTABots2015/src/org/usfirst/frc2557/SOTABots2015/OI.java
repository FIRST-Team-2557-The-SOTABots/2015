 //Jeebus
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

import org.usfirst.frc2557.SOTABots2015.commands.*;
import org.usfirst.frc2557.SOTABots2015.subsystems.Manipulator;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public Joystick XboxController1;
    public Joystick XboxController2;
    //XBox360 Controller:
    public JoystickButton Xbox1A;
    public JoystickButton Xbox1B;
    public JoystickButton Xbox1X;
    public JoystickButton Xbox1Y;
    public JoystickButton Xbox1LB;
    public JoystickButton Xbox1RB;
    public JoystickButton Xbox1BACK;
    public JoystickButton Xbox1START;
    public JoystickButton Xbox1LJB;
    public JoystickButton Xbox1RJB;
    
  //XBox360 Controller2:
    public JoystickButton Xbox2A;
    public JoystickButton Xbox2B;
    public JoystickButton Xbox2X;
    public JoystickButton Xbox2Y;
    public JoystickButton Xbox2LB;
    public JoystickButton Xbox2RB;
    public JoystickButton Xbox2BACK;
    public JoystickButton Xbox2START;
    public JoystickButton Xbox2LJB;
    public JoystickButton Xbox2RJB;
    
    //Right Joystick:
    public JoystickButton RJST;
    public JoystickButton RJSTB;
    public JoystickButton RJS3;
    public JoystickButton RJS4;
    public JoystickButton RJS5;
    public JoystickButton RJS6;
    public JoystickButton RJS7;
    public JoystickButton RJS8;
    public JoystickButton RJS9;
    public JoystickButton RJS10;
    public JoystickButton RJS11;
    public JoystickButton RJS12;
    //Left Joystick:
    public JoystickButton LJST;
    public JoystickButton LJSTB;
    public JoystickButton LJS3;
    public JoystickButton LJS4;
    public JoystickButton LJS5;
    public JoystickButton LJS6;
    public JoystickButton LJS7;
    public JoystickButton LJS8;
    public JoystickButton LJS9;
    public JoystickButton LJS10;
    public JoystickButton LJS11;
    public JoystickButton LJS12;
    boolean toggle = true;

    public OI() {
        XboxController1 = new Joystick(0);
        XboxController2 = new Joystick(1);
        rightJoystick = new Joystick(2);
        leftJoystick = new Joystick(3);
        //XBox360 Controller1 Buttons:
        Xbox1A = new JoystickButton(XboxController1, 1);       
        Xbox1B = new JoystickButton(XboxController1, 2);
        Xbox1X = new JoystickButton(XboxController1, 3);
        Xbox1Y = new JoystickButton(XboxController1, 4);
        Xbox1LB = new JoystickButton(XboxController1, 5);
        Xbox1RB = new JoystickButton(XboxController1, 6);
        Xbox1BACK = new JoystickButton(XboxController1, 7);
        Xbox1START = new JoystickButton(XboxController1, 8);
        Xbox1LJB = new JoystickButton(XboxController1, 9);
        Xbox1RJB = new JoystickButton(XboxController1, 10);
        
      //XBox360 Controller2 Buttons:
        Xbox2A = new JoystickButton(XboxController2, 1);       
        Xbox2B = new JoystickButton(XboxController2, 2);
        Xbox2X = new JoystickButton(XboxController2, 3);
        Xbox2Y = new JoystickButton(XboxController2, 4);
        Xbox2LB = new JoystickButton(XboxController2, 5);
        Xbox2RB = new JoystickButton(XboxController2, 6);
        Xbox2BACK = new JoystickButton(XboxController2, 7);
        Xbox2START = new JoystickButton(XboxController2, 8);
        Xbox2LJB = new JoystickButton(XboxController2, 9);
        Xbox2RJB = new JoystickButton(XboxController2, 10);


        //Button Commands
        Xbox1A.whenPressed(new IntakeOpen());
        Xbox1B.whenPressed(new RightHook());
        Xbox1X.whenPressed(new LeftHook());
        Xbox1Y.whenPressed(new BackHook());
        Xbox1LJB.whileHeld(new IntakeIn());
        Xbox1RJB.whileHeld(new IntakeOut());
        Xbox1LB.whileHeld(new LiftDown());
        Xbox1RB.whileHeld(new LiftUp());
        Xbox1START.whenPressed(new Grab());
        Xbox1BACK.whenPressed(new Eject());
//        Xbox2A.whenPressed(new BackHook());
//        Xbox2B.whenPressed(new RightHook());
//        Xbox2X.whenPressed(new LeftHook());
//        Xbox2LB.whenPressed(new BackDown());
//        Xbox2BACK.whenPressed(new LeftDown());
//        Xbox2START.whenPressed(new RightDown());
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putNumber("Controller POV", XboxController1.getPOV());

       
        
        
    }
    
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }
    public Joystick getmXboxController1() {
    	return XboxController1;
    }
    public Joystick getmXboxController2() {
    	return XboxController2;
    }

}
