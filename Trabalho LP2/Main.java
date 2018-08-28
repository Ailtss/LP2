import java.util.Scanner;
public class Main
{

		public static void main(String args[])
		{

				BallDemo b = new BallDemo();
	
			

				System.out.println("Digite o número de bolas: ");
				Scanner reader = new Scanner(System.in);
				int n = reader.nextInt();	
				reader.close();
				b.drawFrame();
				b.bounce(n);

				System.exit(0);
				

				
			
		}

}
