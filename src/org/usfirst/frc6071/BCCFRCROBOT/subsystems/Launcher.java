// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6071.BCCFRCROBOT.subsystems;

import org.usfirst.frc6071.BCCFRCROBOT.RobotMap;
import org.usfirst.frc6071.BCCFRCROBOT.commands.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Launcher extends Subsystem {

  
    static private final SpeedController launcheMotor1 = RobotMap.launcherLauncherMotor;
    static private final SpeedController launcheMotor2 = RobotMap.launcherLauncherMotorTwo;
   

    public void initDefaultCommand() {
      
    }
    
    public static void start(){ // Pull Up
    	
    	 launcheMotor1.set(-1);
    	 launcheMotor2.set(1);
   
    }
    
    public static void stop() { // Pull Down
   
    	 launcheMotor1.set(1);	
    	 launcheMotor2.set(-1);
    }
    
    public static void realStop() {
    	 launcheMotor1.set(0);
    	 launcheMotor2.set(0);
    }
    
}
