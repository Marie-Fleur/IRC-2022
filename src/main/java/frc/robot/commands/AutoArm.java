package frc.robot.commands;

import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.CommandBase; 

public class AutoArm extends CommandBase {
    private Arm arm;
    private double ls;

    public AutoArm(Arm dt, double ls) {
        this.arm = dt;
        this.ls = ls;
        super.addRequirements(arm);
    }
    
    @Override
    public void initialize() {
        arm.stop();
    }

    @Override
    public void execute() {
        arm.lift(ls);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean stop) {
        arm.stop();
    }
}