/**
 * @author Zachary Seebeck FRC Team 6071
 * @version 0.1
 * 
 */
package AddOnTools;

import edu.wpi.first.wpilibj.Spark;

public class DriveTrain {

	public Spark frontLeft, frontRight, backLeft, backRight; 
	
	
	public void SetMotors(int frontLeft, int frontRight, int backLeft, int backRight) {
		this.frontLeft = new Spark(frontLeft);
		this.backLeft = new Spark(backLeft);
		this.frontRight = new Spark(frontRight);
		this.backRight = new Spark(backRight);	
		System.out.println("Succesfully ran SetMotors()");
	}
	
	
	public void DriveL(double speed, double maxSpeed) {
		speed *= maxSpeed;
		frontLeft.set(speed);
		backLeft.set(speed);
	}
	
	public void DriveL(double speed) {
		frontLeft.set(speed);
		backLeft.set(speed);
	}
	
	public void DriveR(double speed) {
		frontRight.set(speed);
		backRight.set(speed);
	}

	public void DriveR(double speed, double maxSpeed) {
		speed *= maxSpeed;
		frontRight.set(speed);
		backRight.set(speed);
	}
	
	public void Stop() {
		frontLeft.set(0);
		backLeft.set(0);
		frontRight.set(0);
		backRight.set(0);
	}
	
}
