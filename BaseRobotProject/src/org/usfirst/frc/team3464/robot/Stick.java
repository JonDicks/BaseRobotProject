package org.usfirst.frc.team3464.robot;

import edu.wpi.first.wpilibj.Joystick;


public class Stick{
	Joystick stick;
	float x = (float) stick.getX();
	float y = (float) stick.getY();
//			float z = stick.getZ();
	float modifiedx = (float) Math.abs(x - 0.08);
	float modifiedy = (float) Math.abs(y - 0.08);
	public float getmodifiedX(){
		return modifiedx;
	}
	public float getmodifiedY(){
		return modifiedy;
	}
	public Stick(int id){
	stick = new Joystick(id);
	}
	public Stick(float speed, float rotation){
		rotation = getmodifiedX();
		speed = getmodifiedY();
	}


}
