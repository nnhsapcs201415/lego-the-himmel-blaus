import lejos.nxt.LCD;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

public class TouchTest {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        while (!touch.isPressed()){}
        LCD.drawString("Finished", 3, 4);
    }
}