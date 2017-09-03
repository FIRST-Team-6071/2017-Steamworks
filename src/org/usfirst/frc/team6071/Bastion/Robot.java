/**
 * @author Zachary Seebeck FRC Team 6071
 * @version 0.6
 * 
 */
package org.usfirst.frc.team6071.Bastion;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import AddOnTools.*;

public class Robot extends IterativeRobot {



	/*
	 * Variable declarations for Bastion.
	 */
	
	// Controllers
	private Joystick joystickLeft = new Joystick(0);
	private Joystick joystickRight = new Joystick(1);
	
	// Drive Train Creation & extras
	private DriveTrain bastion = new DriveTrain();
	private AdjustMaxSpeed maxSpeedMulti = new AdjustMaxSpeed();
	
	// Drive Train Variables
	public int frontLeft = 0;
	public int frontRight = 2;
	public int backLeft = 1;
	public int backRight = 3;
	
	// Climber Variables
	private Spark climber = new Spark(6);
	
	// Autonomous Variables
	public Timer autonTime = new Timer();

	
	final String autoCenter = "Center Console";
	final String autoRight = "Right Console";
	final String autoLeft = "Left Console";
	final String autoIDGAF = "IDGAF";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	
	@Override
	public void robotInit() {
		
		CameraServer.getInstance().startAutomaticCapture();
		
		chooser.addDefault("Center Console", autoCenter);
		chooser.addObject("Left Console", autoLeft);
		chooser.addObject("Right Console", autoRight);
		chooser.addObject("IDGAF", autoIDGAF);
		SmartDashboard.putData("Auto choices", chooser);
		
		System.out.println("Bastion is alive! Be careful.");
		bastion.SetMotors(frontLeft, frontRight, backLeft, backRight);
		maxSpeedMulti.StartTimer();
		
		
	}

	/* 
	 * 
	 * Not sure what @Override means/does. Haven't had the time to 
	 * look into it so I though that I would just leave it beacuse
	 * it was in there with the base code in WPILib.
	 */
	@Override
	public void autonomousInit() {
		try {
		autoSelected = chooser.getSelected();
		}
		catch (Exception NullPointerException) {
			System.out.println("RIP AUTO");
		}
		finally {
			// autoSelected = autoCenter;
			System.out.println("RIP AUTO x2");
		}
		// autoSelected = SmartDashboard.getString("Auto Selector", autoCenter);
		System.out.println("Auton selected " + autoSelected);
		autonTime.reset();
		autonTime.start();
	}

	@Override
	public void autonomousPeriodic() {
		
		switch(autoSelected) {
		
		
		case autoIDGAF: 
			
			double autoSpeed1 = 0.3;
			double autoSpeed2 = 1;
			
			double autoTimeOne = 5;
			
			if (autonTime.get() < autoTimeOne){
				bastion.DriveL(autoSpeed1);
				bastion.DriveR(-autoSpeed1);
			}
			else {
				bastion.DriveL(autoSpeed2);
				bastion.DriveR(autoSpeed2);
			}
			return;
		
		case autoCenter:
			
			double autonSpeedCenter = 0.3;
			double autonTimeLimit = 2;
			
			if (autonTime.get() < autonTimeLimit)
			{
				bastion.DriveL(autonSpeedCenter);
				bastion.DriveR(-autonSpeedCenter);
			}
			else 
			{
				bastion.Stop();
			}
			
			
			return;
			
		case autoLeft:
			
			double autonSpeedLeft = 0.3;
			
			
			double autonTurnLeftL = 0.15;
			double autonTurnLeftR = -0.15;
			
			double autonSpeedLeft2 = 0.3;
			
			double autonTime1L = 2.3;
			double autonTime2L = 3.3;
			double autonTime3L = 4.8;
			
			if (autonTime.get() < autonTime1L){
				bastion.DriveL(autonSpeedLeft);
				bastion.DriveR(-autonSpeedLeft);
				System.out.println("Step One");
				return;
			}
			if (autonTime.get() < autonTime2L){
				bastion.DriveL(autonTurnLeftL);
				bastion.DriveR(-autonTurnLeftR);
				System.out.println("Step Two");
				return;
			}
			if (autonTime.get() < autonTime3L) {
				bastion.DriveL(autonSpeedLeft2);
				bastion.DriveR(-autonSpeedLeft2);
				System.out.println("Step Three");
				
			}
			else {
				bastion.Stop();
			}
			
			
			
			
			return;
			
		case autoRight:
			
			double autonSpeedRight = 0.3;
			
			
			double autonTurnRightL = -0.15;
			double autonTurnRightR = 0.15;
			
			double autonSpeedRight2 = 0.3;
			
			double autonTime1R = 2.3;
			double autonTime2R = 3.3;
			double autonTime3R = 4.8;
			
			if (autonTime.get() < autonTime1R){
				bastion.DriveL(autonSpeedRight);
				bastion.DriveR(-autonSpeedRight);
				System.out.println("Step One");
				return;
			}
			if (autonTime.get() < autonTime2R){
				bastion.DriveL(autonTurnRightL);
				bastion.DriveR(-autonTurnRightR);
				System.out.println("Step Two");
				return;
			}
			if (autonTime.get() < autonTime3R) {
				bastion.DriveL(autonSpeedRight2);
				bastion.DriveR(-autonSpeedRight2);
				System.out.println("Step Three");
				
			}
			else {
				bastion.Stop();
			}
			
			
			
			
			return;
			
		
		
		}
		
		/*
		System.out.println("Autonomous not set up!");
		
		
		*/
		

	}

	@Override
	public void teleopInit() {
		maxSpeedMulti.ResetMultiplier();
		bastion.Stop();
	}
	
	@Override
	public void teleopPeriodic() {
		bastion.DriveL(-joystickLeft.getRawAxis(1));
		bastion.DriveR(joystickRight.getRawAxis(1));
		
		if (joystickLeft.getRawButton(1) || joystickRight.getRawButton(1)) {  climber.set(-1); }
		else climber.set(0);
		
		/*
		 * Adjusts sencitivity of your joystick.
		 */
		int rightPOV = joystickRight.getPOV(0);
		boolean rightOne = joystickRight.getRawButton(5);
		if (rightPOV == 0) { maxSpeedMulti.RaiseMultiplier(); }
		if (rightPOV == 180) { maxSpeedMulti.LowerMultiplier();}
		// Reset the sencitivity to one.
		if (rightOne) { maxSpeedMulti.ResetMultiplier(); }
		
		
		
	}

	@Override
	public void testPeriodic() {
	}
	
	@Override
	public void disabledPeriodic() {
	}
	
	@Override
	public void disabledInit() {
	}
	
	@Override
	public void robotPeriodic() {
		
	}
	
	
}

