package Domínio;

public abstract class Funcionario
{
	private String m_nome;
	private String m_cpf;
	private double m_salario;
	private double m_bonificacao;
	
	Funcionario()
	{
		m_nome = "";
		m_cpf = "";
		m_salario = 0;
		m_bonificacao = 0;
	}
	
	Funcionario(String nome, String cpf, double salario, double bonificacao)
	{
		m_nome = nome;
		m_cpf = cpf;
		m_salario = salario;
		m_bonificacao = bonificacao;
	}
	
	public abstract double getBonificacao();
	
	public String getNome()
	{
		return m_nome;
	}

	public String getCpf()
	{
		return m_cpf;
	}
	
	public double getSalario()
	{
		return m_salario;
	}
	
	
	public double getB()
	{
		return m_bonificacao;
	}
	
	
	public void setB(double bonificacao)
	{
		m_bonificacao = bonificacao;
	}
 
	public void setSalario(double salario)
	{
		m_salario = salario;
	}
	
}
