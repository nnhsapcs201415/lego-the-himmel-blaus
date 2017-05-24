import lejos.nxt.*;
import lejos.util.Delay;
import lejos.robotics.objectdetection.*;

/**
 * Stop after 4 revolutions based on time, then based on tacho count
 * @author Roger
 *
 */
public class MotorTutor2 {
    public static void main(String[] args) 
    {
        UltrasonicSensor sensor = new UltrasonicSensor(SensorPort.S4);
        if( sensor.getDistance() < 15 )
        {
            LCD.drawString("Program 2", 0, 0);
            //Button.waitForAnyPress();
            Motor.A.setSpeed(150);
            Motor.A.backward();
            //Button.waitForAnyPress();
            //LCD.clear();
            Delay.msDelay(1000);
            LCD.drawInt(Motor.A.getTachoCount(),0,0);
            LCD.drawInt(Motor.A.getTachoCount(),0,1);
            Motor.A.forward();
            //while (Motor.A.getTachoCount()>0); 
            LCD.drawInt(Motor.A.getTachoCount(),0,2);
            //Motor.A.stop();
            LCD.drawInt(Motor.A.getTachoCount(),0,3);   
        }
    }
}