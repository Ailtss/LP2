/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  Ailton Gabriel Figueira Dantas Ramos da Silva
 * @version 11/09/2018
 * Obs.: Código alterado para melhor atender as necessidades do trabalho 2 de LP2
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		System.out.println(taxi1.getStatus());			
		taxi1.book("HIPER");
		System.out.println(taxi1.getStatus());

		Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Shuttle #3");
		System.out.println(shuttle1.getStatus());
		System.out.println("Método lookup funcionou para shuttle");

		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Shuttle #4");
		taxi1.book("HIPER");
		System.out.println(taxi1.getStatus());
		taxi1.arrived();
		System.out.println(taxi1.getStatus());
		System.out.println("Métodos Funcionando para taxi!");

		System.out.println(shuttle1.getStatus());
		shuttle1.arrived();	
		System.out.println(shuttle1.getStatus());
		System.out.println("Métodos Funcionando para shuttled!");
	
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Teste do Desafio proposto pelo Trabalho de LP2. 
	 */

	public void testCalling()
	{
		taxiCo1.showStatus();

		Vehicle transporte = taxiCo1.calling("Darwin");
		System.out.println();
		System.out.println("Procurando por um veículo para Darwin");
		System.out.println();

		if(transporte != null)
			{
				System.out.println("Método funcionou! Seu veículo: ");
				System.out.println(transporte.getStatus());
			}
		else
			{
				System.out.println("Não há veículos disponíveis!");
				System.out.println(transporte.getStatus());
			}
	}

	public static void main(String[] args) {
		Helper helper = new Helper();
		System.out.println("Primeiro teste");
		helper.testBook();

		System.out.println();
		System.out.println();
		
		System.out.println("Segundo teste");
		helper.testArrived();
	
		System.out.println();
		System.out.println();
	
		System.out.println("Testando Desafio");
		helper.testCalling();
	}
}


