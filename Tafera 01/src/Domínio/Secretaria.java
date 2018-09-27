package Domínio;

public class Secretaria extends Funcionario 
{
	public Secretaria()
	{
		super();
	}
	
	public Secretaria(String nome, String cpf, double salario, double bonificacao)
	{
		super(nome, cpf, salario, bonificacao);
	}
	
	public double getBonificacao()
	{
		double novaBonificacao = (super.getSalario()*0.2);
		super.setB(novaBonificacao);
		return novaBonificacao;
		
	
	}
	
	
	
}
