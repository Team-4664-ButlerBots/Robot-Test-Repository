public class SampleBot extends SampleRobot{

    Talon m_MotorA, m_MotorB, m_MotorC, m_MotorD, m_MotorE; //Declares motors 0-4
    MotorDrive m_MotorDrive;
    public void RobotInit(){
        //Initiates the Talon motors

        m_MotorA = new Talon(0);
        m_MotorB = new Talon(1);
        m_MotorC = new Talon(2);
        m_MotorD = new Talon(3);
        m_MotorDrive = new MotorDrive(m_MotorA, m_MotorB, m_MotorC, m_MotorD);
        
        m_MotorE= new Talon(4);
    }
    
    public void AutonomousPeriodic(){
        //Autonomous Code, used currently for example programming.
        
        m_MotorDrive.mecanumDrive_Cartesian(0,1,0); //Drive Forwards at 100%
        wait(2)
        
        m_MotorDrive.mecanumDrive_Cartesian(0,0,0); //Stop Motors
        
        m_MotorE.set(1); //Lifts Arm
        wait(4);
        
        MotorE.set(0); //Stops Arm
    }
}
