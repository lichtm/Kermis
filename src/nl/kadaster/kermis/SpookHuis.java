package nl.kadaster.kermis;

public class SpookHuis extends Attractie {
	String name = "Spookhuis";
	double priceTicket = 3.20;
	
	public void griezelen(){
		System.out.println("\tDoorlopen! Niet voor angsthazen! Oh gij onnozele! Boe .... whaaa, iieeeks!");
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
