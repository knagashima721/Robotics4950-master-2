package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;
/*import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;*/

@TeleOp(name = "OpMode")
@SuppressWarnings("unused")
public class OpMode extends LinearOpMode {

    private DcMotor rightDrive;
    private DcMotor leftDrive;
    private double rightPower, leftPower;


    @Override
    public void runOpMode() {
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY
        //Test

        waitForStart();


        // infinite loop until driver presses STOP
        while (opModeIsActive()) {

            rightPower = gamepad1.right_stick_y;
            leftPower = gamepad1.left_stick_y;

            rightDrive.setPower(rightPower);
            leftDrive.setPower(leftPower);
            telemetry.update();

        }

    }

}