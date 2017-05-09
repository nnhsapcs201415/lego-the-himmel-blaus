import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * Use rotate() methods 
 * @author owner.GLASSEY
 *
 */
public class MotorTutor3 {
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        LCD.drawString("Program 3", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();   
        Motor.A.rotate(1440);
        LCD.drawInt(Motor.A.getTachoCount(),0,0);
        Motor.A.rotateTo(0);
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Button.waitForAnyPress();
    }
}