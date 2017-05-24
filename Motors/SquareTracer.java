import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.objectdetection.*;

/**
 * Trace a square 
 * @author Roger
*/
public class SquareTracer
{
    DifferentialPilot pilot ;
    
    public void  drawSquare(float length)
    {
        for(int i = 0; i<4 ; i++)
        {  
            ObjectDetect listener = new ObjectDetect();
            UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
            RangeFeatureDetector fd = new RangeFeatureDetector( us, 80, 500);
            fd.addListener(listener);
            if( us.getDistance() < 10)
            {
                pilot.rotate(70);  
            }
            else
            {
                pilot.travel(length);           
            }
        }
    }
    
    public static void main(String[] args)
    {
        SquareTracer sq = new SquareTracer();
        sq.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.B, Motor.C);
        sq.drawSquare(15);
    }
}
