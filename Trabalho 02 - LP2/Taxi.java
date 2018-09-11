/**
 * A taxi.
 * Taxis have a unique ID, a location and sometimes a destination.
 * They are either free or occupied.
 * 
 * @author David J. Barnes 
 * @version 2010.12.03
 * 
 * Código Alterado para o Trabalho 2 de LP2.
 * Aluno: Ailton Gabriel Figueira Dantas Ramos da Silva.
 */
public class Taxi extends Vehicle
{
    private boolean m_free;

    /**
     * Constructor for objects of class Taxi.
     * @param base The name of the company's base.
     * @param id This taxi's unique id.
     */
    public Taxi(String base, String id)
    {
				super(id);
				super.setLocation(base);
				super.setDestination(null);
				m_free = true;
    }
    
    /**
     * Book this taxi to the given destination.
     * The status of the taxi will no longer be free.
     * @param destination The taxi's destination.
     */
    public void book(String destination)
    {
        super.setDestination(destination);
        m_free = false;
    }

    /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived()
    {
        super.setLocation(super.getDestination());
        super.setDestination(null);
        m_free = true;
    }

}
