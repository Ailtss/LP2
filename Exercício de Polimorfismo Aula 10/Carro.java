
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro extends Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int m_chassi;
    private boolean m_quatroPortas;

    /**
     * COnstrutor para objetos da classe Carro
     */
    public Carro()
    {
        // inicializa variáveis de instância
        super();
        m_chassi = 0;
        m_quatroPortas = false;
    }
    
    public Carro(String marca, String modelo, int ano, int chassi, boolean quatroPortas)
    {
       super(marca, modelo, ano);
       m_chassi = chassi;
       m_quatroPortas = quatroPortas;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void imprimirDados()
    {
       super.imprimirDados();
       System.out.println("Chassi: " + m_chassi);
       System.out.println("Quatro Portas: " + m_quatroPortas);
        
    }
}
