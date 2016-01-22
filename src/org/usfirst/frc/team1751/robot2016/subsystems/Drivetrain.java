
package org.usfirst.frc.team1751.robot2016.subsystems;

import org.usfirst.frc.team1751.robot2016.commands.TankDrive;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private CANJaguar jag_l1,jag_l2,jag_r1,jag_r2;
	private CANJaguar[] jags = {jag_l1, jag_l2, jag_r1, jag_r2};
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drivetrain(){
		jag_l1 = new CANJaguar(1);
		jag_l2 = new CANJaguar(2);
		jag_r1 = new CANJaguar(3);
		jag_r2 = new CANJaguar(4);
		jag_l1.setPercentMode();
		jag_l2.setPercentMode();
		jag_r1.setPercentMode();
		jag_r2.setPercentMode();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TankDrive());
    }
    public CANJaguar[] getJags(){
    	return jags;
    }
}

