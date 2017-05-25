package nl.kadaster.kermis;

import java.math.BigDecimal;

public class LadderKlimmen extends Attractie {
	String name = "Ladderklimmen";
	double priceTicket = 5.00;
	BigDecimal priceTicketRoundOf = new BigDecimal(priceTicket);
	BigDecimal roundOfPriceTicket = priceTicketRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
	
	public void naamKosten(){
		System.out.println(name +"\t\t €  " +roundOfPriceTicket.toString() +"  \t **");
	}
	
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
		revenues = (priceTicket * ticketsSold);
		BigDecimal revenuesRoundOf = new BigDecimal(revenues);
		BigDecimal roundOfRevenues = revenuesRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println("omzet " +name +"\t => " +ticketsSold +"\t x    €  "+roundOfPriceTicket.toString() +"    =    €  " +roundOfRevenues.toString());
	}
}
