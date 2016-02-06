
package org.usfirst.frc.team1751.robot2016.subsystems;

import org.usfirst.frc.team1751.robot2016.RobotMap;
import org.usfirst.frc.team1751.robot2016.commands.Drive;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private CANJaguar jag_l1,jag_l2,jag_r1,jag_r2;
	private RobotDrive robotDrive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drivetrain(){
		jag_l1 = new CANJaguar(RobotMap.JAG_L1);
		jag_l2 = new CANJaguar(RobotMap.JAG_L2);
		jag_r1 = new CANJaguar(RobotMap.JAG_R1);
		jag_r2 = new CANJaguar(RobotMap.JAG_R2);
		jag_l1.setPercentMode();
		jag_l2.setPercentMode();
		jag_r1.setPercentMode();
		jag_r2.setPercentMode();
		robotDrive = new RobotDrive(jag_l1, jag_l2, jag_r1, jag_r2);
		robotDrive.setSafetyEnabled(false);
		robotDrive.setCANJaguarSyncGroup((byte) 2);
	}
    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
    }
    public void drive(double move, double rotate, double modifier){
    	robotDrive.arcadeDrive(move, rotate);
    }
    
    public void drive(double move, double rotate){
    	drive(move, rotate, 1);
    }
    public void stop(){
    	robotDrive.stopMotor();
    }
    
}

