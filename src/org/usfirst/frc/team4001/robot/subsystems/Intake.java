package org.usfirst.frc.team4001.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Solenoid soleIn;
	private Solenoid soleOut;
	
	public Intake(){
    	soleIn = new Solenoid(1);
    	soleOut = new Solenoid(0);
	}
    
    public void intakeDown(){
    	soleIn.set(false);
    	soleOut.set(true);
    }
    
    public void intakeUp(){
    	soleOut.set(false);
    	soleIn.set(true);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

