package br.ufrn.imd;

public class Media {
	private int nota1;
	private int nota2;
	private int nota3;
	
	
	public Media(int n1, int n2, int n3)
	{
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	
	
	public float calculaMedia()
	{
		return (float) ((nota1 + nota2 + nota3)/3);
				
	}



}
