public class Prova
{
		private double m_nota1;
		private double m_nota2;


		public Prova()
		{
			m_nota1 = 0;
			m_nota2 = 0;
		}

		public Prova(double nota1, double nota2)
		{
			m_nota1 = nota1;
			m_nota2 = nota2;
		}
	
		public double calcularNotaTotal()
		{
			double total = m_nota1 + m_nota2;

			return total;
		}

		public void setFirst(double nota1)
		{
			m_nota1 = nota1;
		}

		public void setSecond(double nota2)
		{
			m_nota2 = nota2;
		}

		public double getFirst()
		{
			return m_nota1;
		}

		public double getSecond()
		{
			return m_nota2;
		}
	

		public void imprimir()
		{
			System.out.println(m_nota1);
			System.out.println(m_nota2);
		}

		
}

