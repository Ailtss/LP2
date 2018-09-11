import java.util.*;

/**
 * Classe Vehicle criada para realização do Trabalho 2 de LP2.
 *
 * @author Ailton Gabriel Figueira Dantas Ramos da Silva
 * @version 11/09/2018
 */

public class Vehicle
{

	private String m_id; //Atributo em comum nas Classes Shuttle e Taxi.
	private String m_destination; //Atributo em comum nas Classes Shuttle e Taxi.
	private String m_location; //Atributo em comum nas Classes Shuttle e Taxi.

	public Vehicle(String id)
	{
		m_id = id;
		m_destination = null;
		m_location = null;
	}


	public String getId() //Método em comum nas classes Shuttle e Taxi.
	{
		return m_id;  
	}

	public String getLocation() //Método em comum nas classes Shuttle e Taxi.
	{
		return m_location;	
	}

	public String getDestination() //Método em comum nas classes Shuttle e Taxi.
	{
		return m_destination;
	}

	public String getStatus() //Método em comum nas classes Shuttle e Taxi melhorado.
	{
		if(m_destination == null)
		{
			return m_id + " at " + m_location + " currently free ";
		}
		else
		{
			return m_id + " at " + m_location + " headed for " +
               m_destination;
		}

	}	

	public void setDestination(String destination) //Método em comum nas classes Shuttle e Taxi.
	{
		m_destination = destination;
	}

	public void setLocation(String location) //Método em comum nas classes Shuttle e Taxi.
	{
		m_location = location;
	}


}
