import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class ObjectDetect implements FeatureListener {

    public static int MAX_DETECT = 80;
    public static int range;
    
    public static void main(String[] args) {

        ObjectDetect listener = new ObjectDetect();
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        fd.addListener(listener);
        Button.waitForAnyPress();
    }

    public void featureDetected(Feature feature, FeatureDetector detector) {
        range = (int)feature.getRangeReading().getRange();
        Sound.playTone(1200 - (range * 10), 100);
        System.out.println("Range:" + range);
    }
    /*
    public static int getRange()
    {
        return range;
    }
    */
}