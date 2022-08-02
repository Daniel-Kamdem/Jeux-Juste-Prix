import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	
		// Déclarer une variable aléatoire
		Random r = new Random();
		int essai = 0;
		
		// Choisir le nombre Aleatoire avec Random
		int justprix = r.nextInt(200);
		
		// le prix commence à 0
		int prix = 0;
		 
		// BOUCLE Tant le juste prix est different du prix
		while(justprix != prix) {
			
			System.out.println("Entrez un numero entre 0 et 200");
			
			// Scanner la console
			Scanner scan = new Scanner(System.in);
			
		
		
		// Condition qui va resortir si c'est plus ou si c'est moin . 
		if(justprix > prix) {
			System.out.println("C'est plus !");
			
		} else {
			System.out.println("C'est moins");
		}
		// Prix est egale a la sugession, 
		prix = scan.nextInt();
		
		// le nombres d'essai realisée par le joueur 
		essai++;
		
		}
		
		System.out.println("Bravo! Le just prix est: " + justprix );
		System.out.println("Vous avez reussi en" + " " + essai + " " + "essais");

	}

}
