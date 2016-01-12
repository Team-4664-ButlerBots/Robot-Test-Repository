public class SampleBot extends SampleBot {

  Victor MotorA;

    public void robotInit() {
      MotorA = new Victor(0);
    }

    public void autonomousPeriodic() {
      MotorA.set = new Victor(.75);
      wait(2);
      MotorA.set = new Victor(0);
      wait(5);
      MotorA.set = new Victor(-.75);
      wait(2);
      MotorA.set = new Victor(0);
    }
}
