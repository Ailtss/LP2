package br.ufrn.imd;

import java.util.Scanner;

public class CalculaMedia {
	public static int nota1 = 0;
	public static int nota2 = 0;
	public static int nota3 = 0;
	
	private static Scanner input;
	
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		nota1 = input.nextInt();
		nota2 = input.nextInt();
		nota3 = input.nextInt();
		
		Media m = new Media(nota1, nota2, nota3);
		
		
		System.out.println("Média calculada: " + m.calculaMedia());
	}
}
