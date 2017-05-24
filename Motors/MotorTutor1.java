import lejos.nxt.*;

public class MotorTutor1
{
    public static void main(String[] args)
    {
        LightSensor light = new LightSensor(SensorPort.S2);
        int count = 0;
        Motor.B.setSpeed(300);
        Motor.C.setSpeed(300);
        while(count < 20)
        {
            if( light.getLightValue() < 15 )
            {
                if( count == 0)
                {
                    Motor.C.rotate(80);
                    count++;
                }
                Motor.C.rotate(15);
                Motor.B.forward();
                Motor.C.forward();
            }
            else
            {
                Motor.C.rotate(80);
                Motor.B.forward();
                Motor.C.forward();
                light.getLightValue();
            }
            LCD.drawString("Program 1", 0, 0);
            //Button.waitForAnyPress();
            LCD.clear();
            Motor.B.setSpeed(300);
            Motor.C.setSpeed(300);
            Motor.B.forward();
            Motor.C.forward();
            LCD.drawString("FORWARD", 0, 0);
            //Button.waitForAnyPress();
            LCD.drawString("BACKWARD", 0, 0);
            // Motor.B.backward();
            //Motor.C.backward();
            //Button.waitForAnyPress();
            //Motor.B.stop();
            //Motor.C.stop();
        }
    }
}