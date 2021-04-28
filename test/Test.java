import java.util.Scanner;

public class Test {
	public static void main(String args[]) { 
		//Déclarartion des variables
		String nom;
		String prenom;
		int age;
		
		//Reccueil des saisie utilisateurs
		
			//Déclaration des objets Scanner et System.in
			Scanner clavier = new Scanner(System.in);
			
			//Demande à l'utilsateur son nom et le stock
			System.out.print("Saisir votre nom : ");
			nom = clavier.nextLine();
			
			//Demande à l'utilsateur son prénom et le stock
			System.out.print("Saisir votre prénom : ");
			prenom = clavier.nextLine();
			
			//Demande à l'utilsateur son prénom et le stock
			System.out.print("Saisir votre âge : ");
			age = clavier.nextInt();
			
			//Affiche les données de l'utilisateur
			System.out.print("Bonjour " + prenom + " " + nom + " tu as " + age + " ans");
			
	}
}