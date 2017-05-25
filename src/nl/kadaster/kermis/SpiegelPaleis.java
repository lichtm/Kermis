package nl.kadaster.kermis;

public class SpiegelPaleis extends Attractie {
	String name = "Spiegelpaleis";
	double priceTicket = 2.50;
	
	public void lachen(){
		System.out.println("\tKomt u maar binnen en zie daar...; Huh ... Haha, is dit mijn spiegelbeeld?");
		ticketsSold++;
		sumTicketsSold++;
		sumRevenues+=priceTicket;
	}
	
	public void kaartVerkoop(){	
		System.out.println("aantal kaartjes "+name +"\t : " +ticketsSold);
	}
	
	public void omzet(){
		revenues = priceTicket * ticketsSold;
		System.out.println("omzet " +name +" \t => " +ticketsSold +"\t x\t" +priceTicket +" = " +revenues);
	}
}
