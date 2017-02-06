package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.*;

public class SubsystemSensors extends Subsystem5800
{
	//Set up sensors here. Make sure to use the RobotMap.
	public ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	
	public Encoder driveEncoderL = new Encoder(driveEncoderL3ID, driveEncoderL1ID);
	public Encoder driveEncoderR = new Encoder(driveEncoderR3ID, driveEncoderR1ID);
	
	public SubsystemSensors() {
		super();
	}

	public final void initSensors() {
		//Start sensors here.
		gyro.reset();
		gyro.calibrate();
		driveEncoderL.reset();
		driveEncoderR.reset();
	}
}
