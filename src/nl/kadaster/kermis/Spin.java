package nl.kadaster.kermis;

import java.math.BigDecimal;

public class Spin extends Attractie {
	String name = "Spin";
	double priceTicket = 2.25;
	BigDecimal priceTicketRoundOf = new BigDecimal(priceTicket);
	BigDecimal roundOfPriceTicket = priceTicketRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
	
	public void naamKosten(){
		System.out.println(name +"\t\t\t €  " +roundOfPriceTicket.toString() +"  \t **");
	}
	
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
		revenues = (priceTicket * ticketsSold);
		BigDecimal revenuesRoundOf = new BigDecimal(revenues);
		BigDecimal roundOfRevenues = revenuesRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println("omzet " +name +"\t\t => " +ticketsSold +"\t x    €  "+roundOfPriceTicket.toString() +"    =    €  " +roundOfRevenues.toString());
	}
}
