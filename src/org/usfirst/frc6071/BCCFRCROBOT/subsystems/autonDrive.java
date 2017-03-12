package org.usfirst.frc6071.BCCFRCROBOT.subsystems;

import org.usfirst.frc6071.BCCFRCROBOT.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *		Autonomous command. 
 */


public class autonDrive extends Subsystem {

	// DriveTrain motor declarations
    static private final SpeedController frontLeft = RobotMap.driveTrainFrontLeft;
    static private final SpeedController backLeft = RobotMap.driveTrainBackLeft;
    static private final SpeedController frontRight = RobotMap.driveTrainFrontRight;
    static private final SpeedController backRight = RobotMap.driveTrainBackRight;
    

    
    // ClawArm motor declaration
    static private final SpeedController clawMotor = RobotMap.clawArmClawMotor;
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	// Raise the claw to it's highest point to avoid problems.
	public static void clawStation(int time) {
		// Write code later.
	}
	
	public static void drive(double d) {
		// Timer.delay(time in milliseconds?);
		
		frontLeft.set(d);
		frontRight.set(-d);
		backLeft.set(d);
		backRight.set(-d);
		
	}

	public static void stop() {
		frontLeft.set(0);
		frontRight.set(0);
		backLeft.set(0);
		backRight.set(0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

