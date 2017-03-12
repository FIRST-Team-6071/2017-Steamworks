// RobotBui/lder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6071.BCCFRCROBOT.subsystems;

import org.usfirst.frc6071.BCCFRCROBOT.Robot;
import org.usfirst.frc6071.BCCFRCROBOT.RobotMap;
import org.usfirst.frc6071.BCCFRCROBOT.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc6071.*;


/**
 *
 */
public class DriveTrain extends Subsystem {

   

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController frontLeft = RobotMap.driveTrainFrontLeft;
    private final SpeedController backLeft = RobotMap.driveTrainBackLeft;
    private final SpeedController frontRight = RobotMap.driveTrainFrontRight;
    private final SpeedController backRight = RobotMap.driveTrainBackRight;
    private final RobotDrive driveTrain = RobotMap.driveTrainDriveTrain;


   

    public void initDefaultCommand() {
        

        setDefaultCommand(new JoystickValues());

   
        // setDefaultCommand(new MySpecialCommand());
    }
    
    //Gets Raw Axis values from the Joystick Values command and outputs to the left track motors
    public void driveL(double leftY){
    	

    	if (leftY <= -.3 || leftY >= .3) {
    	frontLeft.set(-leftY);
    	backLeft.set(-leftY);
    	}
    	
    }
    
    //Gets Raw Axis values from the Joystick Values command and ouputs to the right track motors
    public void driveR(double rightY){
    	if (rightY <= -.3 || rightY >= .3) {
    	frontRight.set(rightY);
    	backRight.set(rightY);
    	}
    }
    
    public void stop() {
    	driveTrain.drive(0, 0);
    	
    }
}