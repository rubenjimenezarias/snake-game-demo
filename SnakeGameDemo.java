import java.util.Random;
import java.awt.Color;
import java.util.ArrayList;
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
    private ArrayList<Segmento> puntos;
    private Random random;

    /**
     * Constructor for objects of class SnakeGameDemo
     */
    public SnakeGameDemo()
    {
        // initialise instance variables
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        myCanvas.erase();
        puntos = new ArrayList<>();
        random = new Random();
        
    }

    /**
     * Draw a snake in the pen's color at the pen's location.
     */
    public void drawSnake()
    {
        Pen pen = new Pen(150, 150, myCanvas);
        
        Segmento segmento = new Segmento(150,150);
        puntos.add(segmento);
        pen.move(20);
        
        for (int i=0; i<2; i++) {
            pen.move(20);
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
            Segmento nuevoSegmento = new Segmento(pen.getX(),pen.getY());
            puntos.add(nuevoSegmento);
        }
        
    }
    
}
