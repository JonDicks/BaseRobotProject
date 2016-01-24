package org.usfirst.frc.team3464.robot;

import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc.team3464.robot.Stick;

public class Drive {
	Stick drivestick;
	private SpeedController drive;
	public SpeedController frontleft;
	public SpeedController rearleft;
	public SpeedController frontright;
	public SpeedController rearright;
	public float speed, angle;
	
	
	public float setSpeed(float speed){
		drivestick = new Stick(0);
		 speed = drivestick.modifiedy;
		 return (this.speed = speed);
	}
	public void setAngle(float angle){
		angle = drivestick.modifiedx;
		this.angle = angle;
	}
	public Drive(SpeedController drive){
		drive = this.drive;
	}
	public Drive(float speed){
		speed = setSpeed(this.speed);
	}
	public Drive(float speed, float angle){
		setSpeed(speed);
		setAngle(angle);
		if (angle == 0){
			drive.set((float) this.speed);
		}
	}
}
