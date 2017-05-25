package nl.kadaster.kermis;

import java.util.Scanner;
import java.util.ArrayList;

public class Kermis {

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		String invoer;

		Attractie botsA = new BotsAuto();
		Attractie spin = new Spin();
		Attractie spiegelP = new SpiegelPaleis();
		Attractie spookH = new SpookHuis();
		Attractie hawaii = new Hawaii();
		Attractie ladderK = new LadderKlimmen();

		System.out.println("Welkom bij de Kermis 'de rode superbal Kermis'.");
		System.out.println("");
		System.out.println("Wij hebben de volgende attracties voor U:");
		System.out.println("***************************************************************************************");
		System.out.println("***************************************************************************************");
		System.out.println("**   Attractie       \t\t kosten      \t Attractie       \t kosten      **");
		System.out.println("** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - **");
		System.out.println("**   1. "+"Botsauto\'s" +"   \t\t € 2.50      \t 4. Spookhuis    \t € 3.20      **");
		System.out.println("**   2. Spin         \t\t € 2.25      \t 5. Hawaii       \t € 2.90      **");
		System.out.println("**   3. Spiegelpaleis\t\t € 2.75      \t 6. Ladderklimmen\t € 5.00      **");
		System.out.println("**                   \t\t             \t                 \t             **");
		System.out.println("** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - **");
		System.out.println("**   K. Kaartverkoop \t\t O. omzet   \t xxx. Naar Uitgang (stop programma)  **");
		System.out.println("***************************************************************************************");
		System.out.println("***************************************************************************************");


		ArrayList<Attractie> attrArray = new ArrayList<>();
		attrArray.add(botsA);
		attrArray.add(spin);
		attrArray.add(spiegelP);
		attrArray.add(spookH);
		attrArray.add(hawaii);
		attrArray.add(ladderK);


		doKeuzemenu:
			do {
				System.out.println("\n"+"Maak een keuze uit bovenstaande menu: < 1, 2, 3, 4, 5, 6, K, O of xxx > ");
				invoer = sc.next();

				switch(invoer){
				case "1" : 
					((BotsAuto)botsA).botsen();
					break;
				case "2": 
					((Spin)spin).spinnen();
					break;
				case "3": 
					((SpiegelPaleis)spiegelP).lachen();
					break;
				case "4": 
					((SpookHuis)spookH).griezelen();
					break;
				case "5": 
					((Hawaii)hawaii).surven();
					break;
				case "6": 
					((LadderKlimmen)ladderK).klouteren();
					break;
				case "xxx": 
					System.out.println("\tBedankt voor Uw bezoek.");
					System.out.println("\tTot een volgende keer.");
					break doKeuzemenu;

				case "K": 
					System.out.println("Totaal aantal kaartjes per attractie:");
					System.out.println("==================================================");
					for (Attractie kaartVerkoop : attrArray){
						kaartVerkoop.kaartVerkoop();
					}
					System.out.println("==================================================");
					System.out.println("totaal kaartjes attracties \t : " +Attractie.sumTicketsSold);
					break;
					
				case "O": 
					System.out.println("Totale omzet per attractie:");
					System.out.println("========================================================");
					for (Attractie omzet : attrArray){
						omzet.omzet();
					}
					System.out.println("========================================================");
					System.out.println("totale omzet attracties \t : \t\t" +Attractie.sumRevenues);
					break;
					//			case "q": 
					//				((BotsAuto)botsA).omzet();
					//				
					//			break;
					//		
				default : System.out.println("\tOnjuiste keuze. Probeer opnieuw.");
				}
			} while (invoer != "000");

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
