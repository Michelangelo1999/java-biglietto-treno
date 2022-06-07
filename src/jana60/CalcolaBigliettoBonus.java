package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBigliettoBonus {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int etaPasseggero;
		double distanza;
		
		System.out.print("inserisci l'età el passeggero: ");
		etaPasseggero = scan.nextInt();
		System.out.print("inserisci la distanza(km) che dovrà essere percorsa: ");
		distanza = scan.nextDouble();
		
		double prezzoDiBase = distanza * 0.21f;
		double scontoMin = 0.2f;
		double scontoOver65 = 0.4f;
		
		double prezzoFinale;
		
		DecimalFormat df = new DecimalFormat(".00");
		
		if(etaPasseggero < 18 && etaPasseggero >= 0 && distanza >= 3) {
			prezzoFinale = prezzoDiBase - (prezzoDiBase*scontoMin);
			System.out.println("prezzo calcolato in base all'età e alla distanza: $" + df.format(prezzoFinale));
		}else if(etaPasseggero > 65 && distanza >= 0){
			prezzoFinale = prezzoDiBase - (prezzoDiBase*scontoOver65);
			System.out.println("prezzo calcolato in base all'età e alla distanza: $" + df.format(prezzoFinale));
		}else if(etaPasseggero < 0 || distanza < 3){
			System.out.println("dati inseriti non validi: costo tratta non calcolabile!");
		}else {
			prezzoFinale = prezzoDiBase;
			System.out.println("prezzo calcolato in base all'età e alla distanza: $" + df.format(prezzoFinale));
		}
		
		
		
//		System.out.printf("prezzo calcolato in base all'età e alla distanza: $%.2f", prezzoFinale);
//    	System.out.println("prezzo calcolato in base all'età e alla distanza: $" + df.format(prezzoFinale);
		
		
        scan.close();

	}

}
