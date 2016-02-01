
package org.usfirst.frc.team6087.robot.subsystems;

import org.usfirst.frc.team6087.robot.RobotMap;
import org.usfirst.frc.team6087.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ChassisSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	RobotDrive chassis;
	Victor spareMotor;
	DigitalInput limitSwitch;
	
	public ChassisSubsystem() {
		chassis = new RobotDrive(RobotMap.LEFT_DRIVE, RobotMap.RIGHT_DRIVE);
		spareMotor = new Victor(RobotMap.SPARE_MOTOR);
	
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
    
    public void drive(Joystick stick) {
    	chassis.arcadeDrive(stick);
    }
    
    public void stopDriving() {
    	chassis.stopMotor();
    }
    	
    public void jogSpareMotor(double power) {
    	spareMotor.set(power);
    }
    	
    public boolean isLimitSwitchPressed() {
    	return limitSwitch.get();
    }
    public void setInverted() {
	} 
    
    
}

