package nl.kadaster.kermis;

import java.math.BigDecimal;

public class BotsAuto extends Attractie {
	String name = "Botsauto\'s";
	double priceTicket = 2.50;
	BigDecimal priceTicketRoundOf = new BigDecimal(priceTicket);
	BigDecimal roundOfPriceTicket = priceTicketRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);

	int autoAantal = 20;
	int maxBezoekersPerRonde = 40;

	public void naamKosten(){
		System.out.println(name +"\t\t €  " +roundOfPriceTicket.toString() +"  \t **");
	}

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
		BigDecimal revenuesRoundOf = new BigDecimal(revenues);
		BigDecimal roundOfRevenues = revenuesRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println("omzet " +name +"\t => " +ticketsSold +"\t x    €  "+roundOfPriceTicket.toString() +"    =    €  " +roundOfRevenues.toString());
	}
}
