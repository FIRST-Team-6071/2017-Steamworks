/**
 * @author Zachary Seebeck FRC Team 6071
 * @version 0.1
 * 
 */
package AddOnTools;

import edu.wpi.first.wpilibj.Timer;

public class AdjustMaxSpeed {

	public double maxSpeedMultiplier;
	private Timer timer = new Timer();
	
	public double LowerMultiplier() {
		if (timer.get() > 0.05){
		if (maxSpeedMultiplier > 0.1) maxSpeedMultiplier -= .1f;
		else System.out.println("Multiplier too low, can't lower any farther.");
		timer.reset();
		timer.start();
		}
		return maxSpeedMultiplier;
	}
	
	public double RaiseMultiplier() {
		if (timer.get() > 0.05){
		if (maxSpeedMultiplier < 1) maxSpeedMultiplier += .1f;
		else System.out.println("Multiplier high low, can't raise any farther.");
		timer.reset();
		timer.start();
		}
		return maxSpeedMultiplier;
	}
	
	public double ResetMultiplier() {
		maxSpeedMultiplier = 1;
		System.out.println("Multiplier reset to 1.");
		return maxSpeedMultiplier;
	}
	
	public void StartTimer() { timer.start(); }
}
