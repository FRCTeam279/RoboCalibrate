package org.usfirst.frc.team279.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


import org.usfirst.frc.team279.robot.commands.*;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private int leftDriverStickPort = 0;
	private Joystick leftDriverStick = null;
	public Joystick getLeftDriverStick(){
		return leftDriverStick;
	}
	
	
	private double leftStickNullZone = 0.25;
	
	public double getLeftStickNullZone() {
		return leftStickNullZone;
	}
	
	
	
	public boolean init() {
		System.out.println("OI: Init Started");

		try{
			leftDriverStick = new Joystick(leftDriverStickPort);
		} catch (Exception e) {
			System.out.println("OI: Error instantiating leftDriverStick: " + e.getMessage());
		}
		
	
		System.out.println("OI: Init Complete");
		return true;   // all good
	}
	

}
