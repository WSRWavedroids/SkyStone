package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by shell on 09/10/2019.
 */

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Basic Iterative Opmode", group="Manual")
public class TeleOp extends OpMode {

    // Declare motors/servos/variables
    private DcMotor myMotor;

    /**
     * Run once after INIT is pushed
     */
    @Override
    public void init() {

        // Initialize motors/servos
        myMotor = hardwareMap.get(DcMotor.class, "myMotor");

        // Set status
        telemetry.addData("Status", "Initialized");
        telemetry.update();

    }

    /**
     * Runs constantly after INIT is pushed but before PLAY is pushed
     */
    @Override
    public void init_loop() {

    }

    /**
     * Runs once after PLAY is pushed
     */
    @Override
    public void start() {

    }

    @Override
    public void loop() {

        if (this.gamepad1.x) {
        } else if (this.gamepad1.b) {
        } else if (this.gamepad1.y) {
        } else if (this.gamepad1.a) {
        }

        if (this.gamepad1.dpad_left) {
        } else if (this.gamepad1.dpad_right) {
        }

        if (this.gamepad1.right_trigger > 0.5) { // When right trigger is clicked
        } else if (this.gamepad1.left_trigger > 0.5) { // When left trigger is clicked
        }

        if (this.gamepad1.dpad_up == this.gamepad1.dpad_down) {
        } else if (this.gamepad1.dpad_up) {
        } else if (this.gamepad1.dpad_down) {
        }

        // Display information about the motors
        telemetry.addData("MyMotor power is ", myMotor.getPower());
        telemetry.addData("Status", "Running");
        telemetry.update();

    }

    /**
     * Runs once after STOP is pushed
     */
    @Override
    public void stop() {

    }

}
