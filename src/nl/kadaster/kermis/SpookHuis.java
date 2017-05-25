package nl.kadaster.kermis;

import java.math.BigDecimal;

public class SpookHuis extends Attractie {
	String name = "Spookhuis";
	double priceTicket = 3.20;
	BigDecimal priceTicketRoundOf = new BigDecimal(priceTicket);
	BigDecimal roundOfPriceTicket = priceTicketRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		
	public void naamKosten(){
		System.out.println(name +"\t\t €  " +roundOfPriceTicket.toString() +"  \t **");
	}
	
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
		revenues = (priceTicket * ticketsSold);
		BigDecimal revenuesRoundOf = new BigDecimal(revenues);
		BigDecimal roundOfRevenues = revenuesRoundOf.setScale(2,BigDecimal.ROUND_HALF_EVEN);
		System.out.println("omzet " +name +"\t\t => " +ticketsSold +"\t x    €  "+roundOfPriceTicket.toString() +"    =    €  " +roundOfRevenues.toString());
	}
}
