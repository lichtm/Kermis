package nl.kadaster.kermis;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class Attractie {

	String name;
	double priceTicket;
	int ticketsSold;
	double revenues;
	static int sumTicketsSold;
	static double sumRevenues;
		
	public abstract void omzet();
	public abstract void kaartVerkoop();
}
