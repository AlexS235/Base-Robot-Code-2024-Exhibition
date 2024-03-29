// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.resources.components.speedController.HighAltitudeMotorController.TypeOfMotor;

/** Add your docs here. */
public class RobotMap {
    // TODO: UPDATE ALL CONSTANTS

    ////////////////////////// SWERVE //////////////////////////

    ///// FRONT LEFT
    // DRIVE
    public static final int SWERVE_FRONT_LEFT_DRIVE_MOTOR_PORT = 16;
    public static final TypeOfMotor SWERVE_FRONT_LEFT_DRIVE_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_FRONT_LEFT_DRIVE_MOTOR_INVERTED = true;
    public static final boolean SWERVE_FRONT_LEFT_DRIVE_ENCODER_INVERTED = false;
    // DIRECTION
    public static final int SWERVE_FRONT_LEFT_DIRECTION_MOTOR_PORT = 17;
    public static final TypeOfMotor SWERVE_FRONT_LEFT_DIRECTION_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_FRONT_LEFT_DIRECTION_MOTOR_INVERTED = true;
    public static final boolean SWERVE_FRONT_LEFT_DIRECTION_ENCODER_INVERTED = true;
    // CANCODER
    public static final int SWERVE_FRONT_LEFT_ENCODED_TALON_PORT = 39;
    public static final double SWERVE_FRONT_LEFT_DIRECTION_ENCODER_OFFSET_PULSES = 0.05029296875;
    public static final boolean SWERVE_FRONT_LEFT_ENCODED_TALON_INVERTED = false;

    ///// FRONT RIGHT
    // DRIVE
    public static final int SWERVE_FRONT_RIGHT_DRIVE_MOTOR_PORT = 10;
    public static final TypeOfMotor SWERVE_FRONT_RIGHT_DRIVE_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_FRONT_RIGHT_DRIVE_MOTOR_INVERTED = false;
    public static final boolean SWERVE_FRONT_RIGHT_DRIVE_ENCODER_INVERTED = false;
    // DIRECTION
    public static final int SWERVE_FRONT_RIGHT_DIRECTION_MOTOR_PORT = 11;
    public static final TypeOfMotor SWERVE_FRONT_RIGHT_DIRECTION_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_FRONT_RIGHT_DIRECTION_MOTOR_INVERTED = true;
    public static final boolean SWERVE_FRONT_RIGHT_DIRECTION_ENCODER_INVERTED = false;
    // CANCODER
    public static final int SWERVE_FRONT_RIGHT_ENCODED_TALON_PORT = 40;
    public static final double SWERVE_FRONT_RIGHT_DIRECTION_ENCODER_OFFSET_PULSES = 0.087158203125;
    public static final boolean SWERVE_FRONT_RIGHT_ENCODED_TALON_INVERTED = false;

    ///// BACK LEFT
    // DRIVE
    public static final int SWERVE_BACK_LEFT_DRIVE_MOTOR_PORT = 14;
    public static final TypeOfMotor SWERVE_BACK_LEFT_DRIVE_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_BACK_LEFT_DRIVE_MOTOR_INVERTED = true;
    public static final boolean SWERVE_BACK_LEFT_DRIVE_ENCODER_INVERTED = true;
    // DIRECTION
    public static final int SWERVE_BACK_LEFT_DIRECTION_MOTOR_PORT = 15;
    public static final TypeOfMotor SWERVE_BACK_LEFT_DIRECTION_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_BACK_LEFT_DIRECTION_MOTOR_INVERTED = true;
    public static final boolean SWERVE_BACK_LEFT_DIRECTION_ENCODER_INVERTED = true;
    // CANCODER
    public static final int SWERVE_BACK_LEFT_ENCODED_TALON_PORT = 38;
    public static final double SWERVE_BACK_LEFT_DIRECTION_ENCODER_OFFSET_PULSES = -0.3564453125;
    public static final boolean SWERVE_BACK_LEFT_ENCODED_TALON_INVERTED = false;

    ///// BACK RIGHT
    // DRIVE
    public static final int SWERVE_BACK_RIGHT_DRIVE_MOTOR_PORT = 12;
    public static final TypeOfMotor SWERVE_BACK_RIGHT_DRIVE_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_BACK_RIGHT_DRIVE_MOTOR_INVERTED = false;
    public static final boolean SWERVE_BACK_RIGHT_DRIVE_ENCODER_INVERTED = false;
    // DIRECTION
    public static final int SWERVE_BACK_RIGHT_DIRECTION_MOTOR_PORT = 13;
    public static final TypeOfMotor SWERVE_BACK_RIGHT_DIRECTION_MOTOR_TYPE = TypeOfMotor.CAN_SPARK_BRUSHLESS;
    public static final boolean SWERVE_BACK_RIGHT_DIRECTION_MOTOR_INVERTED = true;
    public static final boolean SWERVE_BACK_RIGHT_DIRECTION_ENCODER_INVERTED = true;
    // CANCODER
    public static final int SWERVE_BACK_RIGHT_ENCODED_TALON_PORT = 37;
    public static final double SWERVE_BACK_RIGHT_DIRECTION_ENCODER_OFFSET_PULSES = 0.46435546875;
    public static final boolean SWERVE_BACK_RIGHT_ENCODED_TALON_INVERTED = false;

    ////////////////////////// SHOOTER //////////////////////////
    public static final int[] SHOOTER_MOTOR_PORTS = { 11, 12 };
    public static final int[] SHOOTER_INVERTED_MOTORS_PORTS = {};
    public static final boolean SHOOTER_ENCODER_IS_INVERTED = false;
    public static final TypeOfMotor[] SHOOTER_MOTOR_TYPES = { TypeOfMotor.CAN_SPARK_BRUSHLESS,
            TypeOfMotor.CAN_SPARK_BRUSHLESS };

    ////////////////////////// INTAKE //////////////////////////
    public static final int[] INTAKE_MOTOR_PORTS = { 21, 22 };
    public static final int[] INTAKE_INVERTED_MOTORS_PORTS = {};
    public static final boolean INTAKE_ENCODER_IS_INVERTED = false;
    public static final TypeOfMotor[] INTAKE_MOTOR_TYPES = { TypeOfMotor.CAN_SPARK_BRUSHLESS,
            TypeOfMotor.CAN_SPARK_BRUSHLESS };
}
