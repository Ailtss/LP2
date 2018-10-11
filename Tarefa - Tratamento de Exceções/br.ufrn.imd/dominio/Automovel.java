package dominio;

import controle.AcimaVelocidadeException;

public class Automovel
{
	private static int velocidadeMax = 120;
	private int velocidadeAtual;
	
	public Automovel()
	{
		this.velocidadeAtual = 0;
	}
	
	public Automovel(int velocidade)
	{
		this.velocidadeAtual = velocidade;
	}
	
	public int getVelocidaeAt()
	{
		return this.velocidadeAtual;
	}
	
	public void setVelocidadeAt(int value)
	{
		this.velocidadeAtual = value;
	}
	
	public void accel(int velocidade) throws AcimaVelocidadeException
	{
		try
		{
			if(this.getVelocidaeAt() + velocidade <= Automovel.velocidadeMax)
			{
				this.setVelocidadeAt(this.getVelocidaeAt() + velocidade);
			}
			
			else
			{
				throw new AcimaVelocidadeException();
			}
		}
		
		catch(AcimaVelocidadeException e)
		{
			System.out.println(e.ex());
		}
	}
}
