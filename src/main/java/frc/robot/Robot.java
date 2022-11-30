// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.Drive;

public class Robot extends TimedRobot {
  private Joystick lj = new Joystick(0);
  private Joystick rj = new Joystick(1);

  private final Drivetrain drivetrain = new Drivetrain(9, 8);
  private final Drive drive = new Drive(this.drivetrain, this.lj, this.rj);

  @Override
  public void robotInit() {
  }

  @Override
  public void teleopInit() {
    drivetrain.setDefaultCommand(drive);



    //drive.schedule();
    //drive.initialize();
  }

  public void teleopPeriodic() {
    drive.execute();
  }

  @Override
  public void autonomousInit() {
    drive.end(true);
  }
}
