package controle;

import dominio.*;

public class Pista 
{

	private Automovel carro1 = new Automovel(70);
	private Automovel carro2 = new Automovel(110);
	private Automovel carro3 = new Automovel(50);
	
	public void iniciar() throws PistaException
	{
		try 
		{
			carro1.accel(30);
			carro2.accel(10);
			carro3.accel(100);
		}
		
		catch(AcimaVelocidadeException e)
		{
			System.out.println(e.ex());
			throw new PistaException();
		}
		
	}
}
