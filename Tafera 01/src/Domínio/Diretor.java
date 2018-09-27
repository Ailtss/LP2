package Domínio;

public class Diretor extends Funcionario
{

	public Diretor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diretor(String nome, String cpf, double salario, double bonificacao) {
		super(nome, cpf, salario, bonificacao);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao()
	{
		double novaBonificacao = (super.getSalario()*0.4)+2000;
		
		super.setB(novaBonificacao);
		
		return novaBonificacao;
	}

}
