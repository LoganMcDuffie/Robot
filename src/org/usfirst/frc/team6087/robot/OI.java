package org.usfirst.frc.team6087.robot;

import org.usfirst.frc.team6087.robot.commands.StopMotorCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick driveStick;
	
	public Button spareMotor;
	
	public OI() {
		driveStick = new Joystick(RobotMap.DRIVE_JOYSTICK);
		spareMotor = new JoystickButton(driveStick, RobotMap.STOP_MOTOR_BUTTON);
		
		spareMotor.whileHeld(new StopMotorCommand());
	}
   
}

