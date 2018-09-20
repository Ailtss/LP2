package interfaces;

public interface TV {
	void ligar();
	
	default void desligar()
	{
		System.out.println("Desligou!");
	}
}
