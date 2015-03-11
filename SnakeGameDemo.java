import java.util.Random;
import java.awt.Color;
/**
 * Write a description of class SnakeGameDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGameDemo
{
    // instance variables - replace the example below with your own
    private Canvas myCanvas;
    private Random random;
    private int sizeSnake;

    /**
     * Constructor for objects of class SnakeGameDemo
     */
    public SnakeGameDemo()
    {
        // initialise instance variables
        myCanvas = new Canvas("Drawing Demo", 500, 400);  
        myCanvas.erase();
        random = new Random();
        sizeSnake = 10;
    }

    /**
     * Draw a snake in the pen's color at the pen's location.
     */
    public void drawSnake()
    {
        Pen pen = new Pen(150, 150, myCanvas);
        int x = 30;
        for (int i=0; i<3; i++) {
            pen.move(10);
            int numeroAleatorio = random.nextInt(3);
            if (numeroAleatorio == 0)
            {
                pen.turn(90);
            }
            else if (numeroAleatorio == 1)
            {
                pen.turn(270);
            }
            else
            {
                pen.turn(180);
            }
        }
        
    }
}
