package Domínio;

public class Gerente extends Funcionario
{

	public Gerente()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, double salario, double bonificacao)
	{
		super(nome, cpf, salario, bonificacao);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao()
	{
		double novaBonificacao = (super.getSalario()*0.3)+1000;
		
		super.setB(novaBonificacao);
		
		return novaBonificacao;
	}

}
