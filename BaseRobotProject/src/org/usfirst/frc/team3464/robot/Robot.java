
package org.usfirst.frc.team3464.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc.team3464.robot.Drive;
import org.usfirst.frc.team3464.robot.Stick;

public class Robot extends SampleRobot {
	Stick drivestick;
	Drive drive;
	SpeedController robotdrive;

	protected void robotInit(){
    	drivestick = new Stick(0);
    	drive = new Drive(robotdrive);
	}
	
	public void update(){
		drive.setAngle(drivestick.getmodifiedX());
		drive.setSpeed(drivestick.getmodifiedY());
	}
	
    public void autonomous() {
    	
    }

    public void operatorControl() {
    	while (isOperatorControl() && isEnabled()){
    	update();
    	}
    
    }

    public void test() {
    }
}
