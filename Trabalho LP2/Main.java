import java.util.Scanner;
public class Main
{

		public static void main(String args[])
		{

				BallDemo b = new BallDemo();
	
				b.drawFrame();
				b.bounce(5);

				System.out.println("Digite 1 para redimensionar");
				Scanner reader = new Scanner(System.in);
				int n = reader.nextInt();	
				reader.close();
				if(n == 1)
				{
					b.drawFrame();
				}
	

				
			
		}

}
