package org.usfirst.frc.team279.robot.commands;



import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team279.robot.Robot;
import edu.wpi.first.wpilibj.Joystick;




/**
 *
 */
public class CalibrateSpeedCtrls extends Command {
	private RobotDrive roboDrive;
	private Joystick leftJoystick;
	
	//--------------------------------------------------------------------------
    public CalibrateSpeedCtrls() {
    	super("CalibrateSpeedCtrls");
        requires(Robot.dl);
        
        this.setInterruptible(true);
        this.setRunWhenDisabled(false);
    }
    
    
    
    
    //--------------------------------------------------------------------------
    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("CMD: CalibrateSpeedCtrls Init Starting");
    	leftJoystick = Robot.oi.getLeftDriverStick();
    	roboDrive = Robot.dl.getRoboDrive();
    	System.out.println("CMD: CalibrateSpeedCtrls Init Complete");
    }

    
    
    //--------------------------------------------------------------------------
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(leftJoystick == null) {
    		return;
    	}
    	
    	double y = leftJoystick.getY();
    	roboDrive.mecanumDrive_Cartesian(0,  y,  0,  0);
    }

    
    
    
    //--------------------------------------------------------------------------
    
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
