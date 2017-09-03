/**
 * @author Zachary Seebeck FRC Team 6071
 * @version 0.1
 * 
 */
package AddOnTools;



public class Autonomous{

	private double speed;
	
	private double maxTimeOne;
	private double maxTimeTwo;
	private double maxTimeThree;
	
	public Autonomous (int autonNumber) {
	}
	
	public void SetSpeed(double speed) {
		this.speed = speed;
	}
	
	public double GetSpeed() {
		return speed;
	}
		
	public void SetTimings(double time1) {
		this.maxTimeOne = time1;
	}
	
	public void SetTimings(double time1, double time2) {
		this.maxTimeOne = time1;
		this.maxTimeTwo = time2;
	}
	
	public void SetTimings(double time1, double time2, double time3) {
		this.maxTimeOne = time1;
		this.maxTimeTwo = time2;
		this.maxTimeThree = time3;
	}
	
	public double GetTimeing(int selection) {
		
		switch (selection) {
			
		case 1: return this.maxTimeOne;
		case 2: return this.maxTimeTwo;
		case 3: return this.maxTimeThree;
			
		}
		
		return 0;
	}

	
}
