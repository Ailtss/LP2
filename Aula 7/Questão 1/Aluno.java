

public class Aluno

{
		private Prova m_prova1;
		private Prova m_prova2;

		
		public Aluno(){}

		public Aluno(Prova prova1, Prova prova2)
		{
			m_prova1 = prova1;
			m_prova2 = prova2;
		}

		public double calcularMedia()
		{
			double total1 = m_prova1.getFirst() + m_prova1.getSecond();
			double total2 = m_prova2.getFirst() + m_prova2.getSecond();

			double media = (total1+total2)/2;
			
			return media;
		}

}
