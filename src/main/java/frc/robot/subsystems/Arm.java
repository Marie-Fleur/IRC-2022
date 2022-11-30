package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    private MotorController l;
    public Arm(int lport) {
        this.l = new VictorSP(lport);
    }

    public void lift(double ls) {
        this.l.set(ls);
    }

    public void stop() {
        this.l.stopMotor();
    }
}