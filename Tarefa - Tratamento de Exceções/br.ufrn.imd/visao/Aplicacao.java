package visao;

import dominio.*;

import controle.*;


public class Aplicacao
{

	public static void main(String[] args)
	{
		Pista a = new Pista();
		try
		{
			a.iniciar();
		}
		
		catch(PistaException p)
		{
			System.out.println(p.pistaEx());
		}

	}

}
