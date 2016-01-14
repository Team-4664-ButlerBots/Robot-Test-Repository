
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.Livewindow;

public class SampleBot extends SampleRobot{
    
    Victor MotorA;
    Joystick Joy1;
    
    public void robotInit(){
        MotorA = new Victor(0);
        Joy1 = new Joystick(0);
    }
    
    public void autonomousPeriodic(){
        MotorA.set(0.5);
        Timer.Delay(1);
        MotorA.set(0.0);
        Timer.Delay(.5);
        MotorA.set(-0.5);
        Timer.Delay(1);
        MotorA.set(0.0);
    }
    
    public void operatorControl() {
    	while(isOperatorControl && isEnabled) {
    		MotorA.set(Joy1.GetX());
    		Timer.Delay(0.05); //motor update time
    	}
    	
    }
    
}
