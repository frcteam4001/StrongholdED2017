package org.usfirst.frc.team4001.robot.subsystems;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private CANTalon shooterMotor;

    // Put methods for controlling this subsystem
    public Shooter(){
    	
    	shooterMotor = new CANTalon(13);
    	shooterMotor.setPID(0.22, 0, 0);
    	
    }
    public void setControlMode(){
    	shooterMotor.changeControlMode(TalonControlMode.Speed);
    }
    
    public void setSpeed(){
    	shooterMotor.set(0.5);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

