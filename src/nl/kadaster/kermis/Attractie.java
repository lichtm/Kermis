package nl.kadaster.kermis;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Attractie {

	String name;
	double priceTicket;
//	BigDecimal bedragAfgerond = new BigDecimal(priceTicket);
//	BigDecimal afgerondBedrag = bedragAfgerond.setScale(2,BigDecimal.ROUND_HALF_EVEN);
	int ticketsSold;
	double revenues;
	static int sumTicketsSold;
	static double sumRevenues;
	
	public void naamKosten(){}
	public abstract void omzet();
	public abstract void kaartVerkoop();
}
