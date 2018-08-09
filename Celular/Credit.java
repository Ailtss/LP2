
/**
 * Escreva a descrição da classe Credit aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Credit
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int m_saldo;

    /**
     * COnstrutor para objetos da classe Credit
     */
    public Credit()
    {
        // inicializa variáveis de instância
        m_saldo = 1000;
        
    }
    
    public Credit(int valor)
    {
        if(valor > 0)
        {
            m_saldo = valor;
        }
        
        else
        {
            System.out.println("Erro! Valor menor que 0. Objeto vai ser inicializado com 0");
        }   
        
    }
    
    public int getSaldo()
    {
        return m_saldo;
    }
    
    public void setSaldo(int valor)
    {
        if(valor > 0)
        {
            m_saldo = valor;
        }
        
        else
        {
            System.out.println("Erro! Valor menor que 0!");
        }
    }
    
    public void topUp(int valor)
    {
        m_saldo += valor;
    }
    
    public void uso(int valor)
    {
        m_saldo -= valor;
    }

}
