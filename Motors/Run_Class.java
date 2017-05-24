import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class Run_Class
{
    public static void main( String[] args )
    {
        run();
    }
    
    public static void run()
    {
        int state = 0;
        String[] str = new String[0];
        final int MAX_DETECT = 80;
        while(state != 4)
        {
            if(state == 0)
            {
                SquareTracer.main(str);
                state = 1;
            }
            else if(state == 1)
            {
                MotorTutor1.main(str);
                MotorTutor2.main(str);
                state = 2;
            }
            else if( state == 2)
            {
                state = 4;
            }
            else
            {
            }
        }
    }
}