import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class Run_Class
{
    public void run()
    {
        int state = 0;
        String[] str = new String[0];
        final int MAX_DETECT = 80;
        while(state != 3)
        {
            if(state == 0)
            {
                SquareTracer.main(str);
                /*
                ObjectDetect.main(str);
                if(ObjectDetect.getRange() > 10)
                {
                    MotorTutor1.main(str);
                }*/
            }
            if(state == 1)
            {
                
            }
        }
    }
}