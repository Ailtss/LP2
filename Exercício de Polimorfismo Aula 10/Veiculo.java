
/**
 * Escreva a descrição da classe Veiculo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String m_marca;
    private String m_modelo;
    private int m_ano;

    /**
     * COnstrutor para objetos da classe Veiculo
     */
    public Veiculo()
    {
        // inicializa variáveis de instância
        m_marca = "";
        m_modelo = "";
        m_ano = 0;
    }
    
    public Veiculo(String marca, String modelo, int ano)
    {
        m_marca = marca;
        m_modelo = modelo;
        m_ano = ano;
    }
    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void buzinar()
    {
        // ponha seu código aqui
        System.out.println("Buzina!!");
    }
    
    public void imprimirDados()
    {
        System.out.println("Marca: " + m_marca);
        System.out.println("Modelo: " + m_modelo);
        System.out.println("Ano: " + m_ano);
    }
}
