package nl.kadaster.kermis;

public class BotsAuto extends Attractie {
	String name = "Botsauto\'s";
	double priceTicket = 2.50;
	
	int autoAantal = 20;
	int maxBezoekersPerRonde = 40;
	
	void botsen(){
		System.out.println("\tRiemen vast en .... Boem, Bots, Bam!!");
		ticketsSold++;
		sumTicketsSold++;
		sumRevenues+=priceTicket;
	}
	
	public void kaartVerkoop(){	
		System.out.println("aantal kaartjes "+name +"\t : " +ticketsSold);
	}
	
	public void omzet(){
		revenues = (priceTicket * ticketsSold);
		System.out.println("omzet " +name +"\t => " +ticketsSold +"\t x\t"+priceTicket +" = " +revenues);
	}
}
