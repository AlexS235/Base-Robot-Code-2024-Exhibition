// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.manipulator.shooter;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.resources.components.speedController.HighAltitudeMotorGroup;

//TODO: PIDHighAltitudeMotorGroup? The idea is to PID the motors individually, not by group

public class Shooter extends SubsystemBase {
  HighAltitudeMotorGroup shooterMotors;

  /** Creates a new Shooter. */
  public Shooter() {
    shooterMotors = new HighAltitudeMotorGroup(RobotMap.SHOOTER_MOTOR_PORTS, RobotMap.SHOOTER_INVERTED_MOTORS_PORTS, RobotMap.SHOOTER_MOTOR_TYPES);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
