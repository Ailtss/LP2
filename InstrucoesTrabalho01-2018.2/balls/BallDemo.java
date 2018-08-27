import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Dimension;
import java.util.Random;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 * 
 * Classe Modificada para o trabalho de LP2
 * Aluno: Ailton Gabriel Figueira Dantas Ramos da Silva
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate bouncing balls
     */
    public void bounce(int value)
    {
        if(value < 0)
					{
						System.out.println("Erro! Entre com um valor maior que 0");		
					}
	
				else
				{
						Color[] cores = {Color.red, Color.green, Color.orange, Color.gray, Color.blue};
						int ground = ((HEIGHT*90)/100) ;   // position of the ground line(MODIFICADO)
        		int xStart = 20;    // x-start of the ground line(MODIFICADO)
        		int xLimit = WIDTH-20;   // x-limit of the ground line(MODIFICADO)
						Random ran = new Random();
						

        		myCanvas.setVisible(true);

        		// draw the ground
        		myCanvas.setForegroundColor(Color.black);
        		myCanvas.drawLine(xStart, ground, xLimit, ground);

        		// crate and show the balls
						ArrayList<BouncingBall> balls = new ArrayList<BouncingBall>();
						int i;
						for(i = 0; i < value;i++)
						{
							int xPos = ran.nextInt(WIDTH);
							int yPos = ran.nextInt(HEIGHT/2);
							int cor = ran.nextInt(5);
							balls.add(new BouncingBall(xPos, yPos, 16, cores[cor], ground, myCanvas));
							balls.get(i).draw();
						}

						

        		// Make them bounce until both have gone beyond the xLimit.
        		boolean finished =  false;
        		while(!finished)
						{
				
										myCanvas.wait(30);         // small delay(MODIFICADO)
										for(i = 0; i < balls.size();i++)
										{
											balls.get(i).move();
											if(balls.get(i).getXPosition() >= xLimit - 20)
												{
													balls.get(i).erase();
												}
										}
										
							

							if(balls.size() == 0)
								{
									finished = true;
               	}
			
       		 }
       		
				}
   	}

		public void drawFrame()
		{
				myCanvas.erase();
				myCanvas.setForegroundColor(Color.black);

        // the shape to draw and move
        int xPos = 20;
				int yPos = 20;
				int altura = HEIGHT-42; //42 = Distância de pixels
				int largura = WIDTH-42;
        Rectangle rect = new Rectangle(xPos, yPos, largura, altura);

        myCanvas.draw(rect);




			
		}

    
}
