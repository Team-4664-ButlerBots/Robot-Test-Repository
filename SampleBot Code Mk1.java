public class SampleBot extends SampleRobot{
    
    Victor MotorA;
    
    public void RobotInit(){
        MotorA = new Victor(0);
    }
    
    public void AutonomousPeriodic(){
        MotorA.set(0.5);
        wait(1);
        MotorA.set(0.0);
        wait(.5);
        MotorA.set(-0.5);
        wait(1);
        MotorA.set(0.0);
    }
    
}
