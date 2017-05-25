package nl.kadaster.kermis;

public class LadderKlimmen extends Attractie {
	String name = "Ladderklimmen";
	double priceTicket = 5.00;
	
	public void klouteren(){
		System.out.println("\tKlimmen en klouteren maarrrrr; alleehup ... pfff, zucht");
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
