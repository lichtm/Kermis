package nl.kadaster.kermis;

import java.util.Scanner;
import java.util.ArrayList;

public class Kermis {
	//	ArrayList<Attractie> attracties = new ArrayList<Attractie>();
	//	attracties.add(Attractie botsAuto = new BotsAuto());
	//	Drank[] drankjes = new Drank[4];
	//	drankjes[0] = new Fris();
	//	drankjes[1] = new Bier();
	//	drankjes[2] = new Fris();
	//	drankjes[3] = new Wijn();

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int invoer;

		System.out.println("Welkom bij de Kermis 'de rode superbal Kermis'.");
		System.out.println("");
		System.out.println("Wij hebben de volgende attracties voor U");
		System.out.println("*******************************************");
		System.out.println("**   Attractie           kosten kaartje  **");
		System.out.println("** - - - - - - - - - - - - - - - - - - - **");
		System.out.println("**   1. Botsauto's           € 2.50      **");
		System.out.println("**   2. Spin                 € 2.25      **");
		System.out.println("**   3. Spiegelpaleis        € 2.75      **"); 
		System.out.println("**   4. Spookhuis            € 3.20      **");
		System.out.println("**   5. Hawaii               € 2.90      **");
		System.out.println("**   6. Ladderklimmen        € 5.00      **");
		System.out.println("** 000. Naar Uitgang                     **");
		System.out.println("*******************************************");

		BotsAuto botsA = new BotsAuto();
		Spin spin = new Spin();
		SpiegelPaleis spiegelP = new SpiegelPaleis();
		SpookHuis spookH = new SpookHuis();
		Hawaii hawaii = new Hawaii();
		LadderKlimmen ladderK = new LadderKlimmen();
		
		do {
			System.out.println("\n"+"Maak een keuze uit bovenstaande menu: < 1, 2, 3, 4, 5, 6 of 000 > ");
			invoer = sc.nextInt();
			
			switch(invoer){
			case 1 : 
				botsA.botsen();
			break;
			case 2: 
				spin.spinnen();
			break;
			case 3: 
				spiegelP.lachen();
			break;
			case 4: 
				spookH.griezelen();
			break;
			case 5: 
				hawaii.surven();
			break;
			case 6: 
				ladderK.klouteren();
			break;
			case 000: System.out.println("    Bedankt voor Uw bezoek.");
			System.out.println("    Tot een volgende keer.");
			break;
			default : System.out.println("    Onjuiste keuze. Probeer opnieuw.");
			}
		} while (invoer != 000);

		//		class Attractive aanroepen
		//		Attractie kermisAttractie = new Attractie();
		//		kermisAttractie.kiestUMaar();


	}

}


// omzet Kermis bijhouden
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
