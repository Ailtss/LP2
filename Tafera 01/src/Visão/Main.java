package Vis�o;

import Controle.*;
import Dom�nio.*;
public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Funcionario a = new Secretaria("Esta � Secret�ria", "123456789", 1000.0, 200.0);
		Funcionario b = new Gerente("Este � Gerente", "987654321", 2000.0, 0);
		Funcionario c = new Diretor("Este � Diretor", "345678123", 3000.0, 0);
		
		DAOFuncionario teste = new DAOFuncionario();
		
		teste.cadastrarFuncionario(a);
		teste.cadastrarFuncionario(b);
		teste.cadastrarFuncionario(c);
		
		teste.listarFuncionarios();
		

	}

}
