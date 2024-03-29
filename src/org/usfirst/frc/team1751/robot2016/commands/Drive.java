
package org.usfirst.frc.team1751.robot2016.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1751.robot2016.Robot;

/**
 * 
 */
public class Drive extends Command {
	
    public Drive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(Robot.oi.getDriveStick().getRawAxis(1), Robot.oi.getDriveStick().getRawAxis(2));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
