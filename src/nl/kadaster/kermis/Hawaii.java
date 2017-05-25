package nl.kadaster.kermis;

public class Hawaii extends Attractie {
	String name = "Hawaii";
	double priceTicket = 2.90;
	
	public void surven(){
		System.out.println("\tZijn jullie allemaal klaarrr voor een trrripipip naarrrr Hawaiiii; SurfsUp!");
		ticketsSold++;
		sumTicketsSold++;
		sumRevenues+=priceTicket;
	}
	
	public void kaartVerkoop(){	
		System.out.println("aantal kaartjes "+name +"\t\t : " +ticketsSold);
	}
	
	public void omzet(){
		revenues = priceTicket * ticketsSold;
		System.out.println("omzet " +name +" \t\t => " +ticketsSold +"\t x\t" +priceTicket +" = " +revenues);
	}
}
