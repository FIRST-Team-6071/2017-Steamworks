package org.usfirst.frc6071.BCCFRCROBOT.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class climbDown extends Command {

    public climbDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//org.usfirst.frc6071.BCCFRCROBOT.subsystems.climbArm.Down();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
