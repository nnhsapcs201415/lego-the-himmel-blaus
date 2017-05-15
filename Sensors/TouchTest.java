import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchTest {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        while (!touch.isPressed()){}
        LCD.drawString("Finished", 3, 4);
    }
}