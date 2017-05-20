package nl.kadaster.kermis;



public class BotsAuto extends Attractie {
	double priceTicket = 2.50;
	int ticketsSold = 0;
	double revenues = 0;
	int autoAantal = 20;
	int maxBezoekersPerRonde = 40;
	
	void botsen(){
		ticketsSold++;
		revenues = priceTicket * ticketsSold;
		sumRevenues += priceTicket * ticketsSold;
		sumTicketsSold++;
		System.out.println("    Riemen vast en .... Boem, Bots, Bam!!");
		System.out.println("aantal kaartjes botsauto\'s : " +ticketsSold +" omzet botsauto\'s : " +revenues);
		System.out.println("totaal kaartjes attracties : " +sumTicketsSold +" totale omzet attracties : " +sumRevenues);
	}
}
