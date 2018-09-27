package Controle;

import java.util.ArrayList;

import Domínio.*;

public class DAOFuncionario
{
	private ArrayList<Funcionario> listFunc;
	
	
	public DAOFuncionario()
	{
		this.listFunc = new ArrayList<Funcionario>();
	}
	public void cadastrarFuncionario(Funcionario f)
	{
		this.listFunc.add(f);
	}
	
	public void listarFuncionarios()
	{
		int tamanho = this.listFunc.size();
		
		for (int i = 0; i < tamanho; i++)
		{
			if(this.listFunc.get(i) instanceof Secretaria)
			{
				System.out.println("***************");
				System.out.println("Nome...: " + this.listFunc.get(i).getNome() + "- Secretária");
				System.out.println("CPF....: " + this.listFunc.get(i).getCpf());
				System.out.println("Salário: " + this.listFunc.get(i).getSalario());
				System.out.println("Bonos..: " + this.listFunc.get(i).getBonificacao());
				System.out.println("***************");
			}
			
			else if(this.listFunc.get(i) instanceof Diretor)
			{
				System.out.println("***************");
				System.out.println("Nome...: " + this.listFunc.get(i).getNome() + "- Diretor");
				System.out.println("CPF....: " + this.listFunc.get(i).getCpf());
				System.out.println("Salário: " + this.listFunc.get(i).getSalario());
				System.out.println("Bonos..: " + this.listFunc.get(i).getBonificacao());
				System.out.println("***************");
				
			}
			
			else if(this.listFunc.get(i) instanceof Gerente)
			{
				System.out.println("***************");
				System.out.println("Nome...: " + this.listFunc.get(i).getNome() + "- Gerente");
				System.out.println("CPF....: " + this.listFunc.get(i).getCpf());
				System.out.println("Salário: " + this.listFunc.get(i).getSalario());
				System.out.println("Bonos..: " + this.listFunc.get(i).getBonificacao());
				System.out.println("***************");
			}
		}
	}
}
