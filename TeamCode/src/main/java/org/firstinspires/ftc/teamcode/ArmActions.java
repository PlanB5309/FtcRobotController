package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.Servo;

public class ArmActions {
    Apendage arm;  // false is left, true is right
    double time;
    double position;

    public ArmActions(Apendage arm, double time, double position) {
        this.arm = arm;
        this.time = time;
        this.position = position;
    }
}
