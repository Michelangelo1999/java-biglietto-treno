package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float distanza;
		int etaPasseggero;
		
		System.out.print("inserisci l'età el passeggero: ");
		etaPasseggero = scan.nextInt();
		System.out.print("inserisci la distanza(km) che dovrà essere percorsa: ");
		distanza = scan.nextFloat();
		
		float prezzoDiBase = distanza * 0.21f;
		float scontoMin = 0.2f;
		float scontoOver65 = 0.4f;
		
		float prezzoFinale;
		
		if(etaPasseggero < 18) {
			prezzoFinale = prezzoDiBase - (prezzoDiBase*scontoMin);
		}else if(etaPasseggero > 65){
			prezzoFinale = prezzoDiBase - (prezzoDiBase*scontoOver65);
		}else {
			prezzoFinale = prezzoDiBase;
		}
		
		System.out.println("prezzo calcolato in base all'età e alla distanza: $" + prezzoFinale);
		
		
        scan.close();
	}

}
