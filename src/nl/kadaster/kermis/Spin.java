package nl.kadaster.kermis;

public class Spin extends Attractie {
	String name = "Spin";
	double priceTicket = 2.25;
	
	public void spinnen(){
		System.out.println("\tZakjes gereed .... drrraaiennnn maarrrr; spin @");
		ticketsSold++;
		sumTicketsSold++;
		sumRevenues+=priceTicket;
	}
	
	public void kaartVerkoop(){	
		System.out.println("aantal kaartjes "+name +"\t\t : " +ticketsSold);
	}
	
	public void omzet(){
		revenues = priceTicket * ticketsSold;
		System.out.println("omzet " +name +"\t\t => " +ticketsSold +"\t x\t" +priceTicket +" = " +revenues);
	}
}
