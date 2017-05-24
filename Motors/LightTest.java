import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;

public class LightTest {
    public static void main(String[] args) throws Exception {
        LightSensor light = new LightSensor(SensorPort.S2);

        while (!Button.ESCAPE.isDown()) {
            LCD.drawInt(light.getLightValue(), 4, 0, 0);
            //LCD.drawInt(light.getNormalizedLightValue(), 4, 0, 1);
            //LCD.drawInt(SensorPort.S2.readRawValue(), 4, 0, 2);
            LCD.drawInt(SensorPort.S2.readValue(), 4, 0, 3);
        }
    }
}