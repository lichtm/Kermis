package nl.kadaster.kermis;

import java.util.Scanner;
import java.util.ArrayList;

public class Kermis {

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		String invoer;
		int menuNr =1;

		Attractie botsAuto = new BotsAuto();
		Attractie spin = new Spin();
		Attractie spiegelPaleis = new SpiegelPaleis();
		Attractie spookHuis = new SpookHuis();
		Attractie hawaii = new Hawaii();
		Attractie ladderKlimmen = new LadderKlimmen();

		ArrayList<Attractie> attrArray = new ArrayList<>();
		attrArray.add(botsAuto);
		attrArray.add(spin);
		attrArray.add(spiegelPaleis);
		attrArray.add(spookHuis);
		attrArray.add(hawaii);
		attrArray.add(ladderKlimmen);

		System.out.println("Welkom bij Kermis 'de RODE SUPERBAL'.");
		System.out.println("");
		System.out.println("Wij hebben de volgende attracties voor U:");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("**   Attractie                   kosten          **");
		System.out.println("** - - - - - - - - - - - - - - - - - - - - - - - **");
		for (Attractie naamKosten : attrArray){
			System.out.print("**  " +menuNr++ +"  -  ");
			naamKosten.naamKosten();
		}
		System.out.println("***************************************************");
		System.out.println("**  k  -  Kaartverkoop                           **");
		System.out.println("**  o  -  Omzet                                  **");
		System.out.println("** xxx -  Naar Uitgang (stop programma)          **");
		System.out.println("***************************************************");
		System.out.println("***************************************************");

		doKeuzemenu:
			do {
				System.out.println("\n"+"Maak een keuze uit bovenstaande menu: < 1, 2, 3, 4, 5, 6, 'k', 'o' of 'xxx' > ");
				invoer = sc.next();

				switch(invoer){
				case "1" : 
					((BotsAuto)botsAuto).botsen();
					break;
				case "2": 
					((Spin)spin).spinnen();
					break;
				case "3": 
					((SpiegelPaleis)spiegelPaleis).lachen();
					break;
				case "4": 
					((SpookHuis)spookHuis).griezelen();
					break;
				case "5": 
					((Hawaii)hawaii).surven();
					break;
				case "6": 
					((LadderKlimmen)ladderKlimmen).klouteren();
					break;

				case "k": 
					System.out.println("Totaal aantal kaartjes per attractie:");
					System.out.println("==================================================");
					for (Attractie kaartVerkoop : attrArray){
						kaartVerkoop.kaartVerkoop();
					}
					System.out.println("==================================================");
					System.out.println("totaal kaartjes attracties \t : " +Attractie.sumTicketsSold);
					break;

				case "o": 
					System.out.println("Totale omzet per attractie:");
					System.out.println("==================================================================");
					for (Attractie omzet : attrArray){
						omzet.omzet();
					}
					System.out.println("==================================================================");
					System.out.println("totale omzet attracties \t : \t\t      €  " +Attractie.sumRevenues);
					break;

				case "xxx": 
					System.out.println("\tBedankt voor Uw bezoek.");
					System.out.println("\tTot een volgende keer.");
					break doKeuzemenu;
				default : System.out.println("\tOnjuiste keuze. Probeer opnieuw.");
				}
			} while (invoer != "xxx");

	}

}


// OPDRACHT omzet Kermis bijhouden
// ==============================================================================================================
// 6 attracties subclass van Attractie
// menu voor
// 1. botsauto's 		(-1) 2.50
// 2. spin				(-2) 2.25
// 3. spiegelpaleis		(-3) 2.75
// 4. spookhuis			(-4) 3.20
// 5. hawaii			(-5) 2.90
// 6. ladderklimmen		(-6) 5.00

// per attractie en totaal :omzet, aantal keren per attractie
// ArrayList
// extends Class
// ==============================================================================================================
//Zoals jullie merken worden jullie steeds vaardiger. Inmiddels is de 2e week al weer bijna 
//voorbij en mogen we jullie weer een nieuwe weekopdracht voorschotelen.
//
//{ Je gaat een programma maken dat de omzet van een Kermis bijhoudt. De Kermis heeft een zestal attracties, 
//	die zijn allemaal subclasse van een klasse Attractie. Zodra het programma start kan er een getal worden 
//	ingegeven, 
//	1 voor botsauto's, 
//	2 voor spin, 
//	3 voor spiegelpaleis, 
//	4 voor spookhuis, 
//	5 voor hawaii, 
//	6 voor ladderklimmen. 

//	botsauto 		- 1 
//	spin 			- 2 
//	spiegelpaleis 	- 3 
//	spookhuis 		- 4 
//	hawaii 			- 5 
//	ladderklimmen 	- 6 
//	
//	MAKKELIJK: Zorg dat het bovenstaande stabiel werkt en dat iedere keer dat het getal wordt ingegeven er getoond 
//	wordt welke attractie draait. 
//	
//	MIDDEL: 
//	Botsauto's kosten 2.50, 
//	Spin 2.25, 
//	Spiegelpaleis 2.75, 
//	spookhuis 3.20, 
//	hawaii 2.90 en 
//	ladderklimmen 5.00. 
//
//	Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is.
//	Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
//	Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes. 
//	Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid 
//	tussen het gebruik van instance variabelen en class variabelen. 
//	
//	MOEILIJK: Maak een Klasse erbij, te weten 
//	Voedselkraampjes, Met de getallen 
//	11 voor oliebollenkraam a 4.00 per consumptie, 
//	22 voor frietkraam a 3.45 per consumptie, 
//	33 voor mueslikraam a 9.00 per consumptie en 
//	44 voor shoarmatent a 5.15 per consumptie. 
//	11 voor oliebollenkraam a 4.00 per consumptie 
//	22 voor frietkraam a 3.45 per consumptie 
//	33 voor mueslikraam a 9.00 per consumptie 
//	44 voor shoarmatent a 5.15 per consumptie. 
//	Zorg dat je de omzet en het aantal aankopen overzichtelijk maakt. Gebruik encapsulation voor het aanpassen 
//	van de class variabelen. 
//	
//	Belangrijk: Het is belangrijker dat je een logisch werkend programma maakt, dan dat je een kermis oplevert 
//	hoe een kermis hoort te zijn. Mocht een uitdaging niet lukken om te realiseren, dan heb je 3 mislukte pogingen gemaild. 
//	De weekopdracht wordt ingeleverd voor Maandag 23 Januari om 9.30 uur bij de 
//	beide email-adressen: Cor.Faber@gmail.com JasperHolshuijsen@gmail.com 
//	LET WEL: Hetgeen dat je mailt is een link naar je repository !!! De code moet op je repository op GitHub staan. } 
