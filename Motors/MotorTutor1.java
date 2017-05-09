import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class MotorTutor1
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.forward();
        LCD.drawString("CHIRAG BACKWARDS IS", 0, 0);
        Button.waitForAnyPress();
        LCD.drawString("GARIHC FORWARDS IS", 0, 0);
        Motor.A.backward();
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}