import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchTest {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        if(touch.isPressed()) {
            String[] list = new String[0];
            MotorTutor2.main(list);
        }
        else
        {
            
        }
        LCD.drawString("Finished", 3, 4);
    }
}