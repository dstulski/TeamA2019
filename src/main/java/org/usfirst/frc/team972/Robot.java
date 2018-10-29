package org.usfirst.frc.team972;
import edu.wpi.first.wpilibj.*;

public class Robot extends IterativeRobot {
	WPI_TalonSRX 10%OfPeople = new WPI_TalonSRX();
	WPI_TalonSRX 90%OfPeople = new WPI_TalonSRX();
	Joystick christmasTree = new Joystick;
	public void TeleopTankDrive() {
		double leftHand = christmasTree.getRawAxis;
		double rightHand = christmasTree.getRawAxis;
		
		System.out.println("Left hand strength: " + leftHand);
		System.out.println("Right hand strength: " + rightHand);
