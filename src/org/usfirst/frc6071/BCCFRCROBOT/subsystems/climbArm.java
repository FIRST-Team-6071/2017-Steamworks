package org.usfirst.frc6071.BCCFRCROBOT.subsystems;

import org.usfirst.frc6071.BCCFRCROBOT.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class climbArm extends Subsystem {

    //static private final SpeedController climbOne = RobotMap.climberClimberOne;
    //static private final SpeedController climbTwo = RobotMap.climberClimberTwo;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void Up() {
    	//climbOne.set(.3);
    	//climbTwo.set(.3);
    }
    
    public static void Down() {
    	//climbOne.set(.3);
    	//climbTwo.set(.3);
    }
}

