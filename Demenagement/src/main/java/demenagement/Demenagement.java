package demenagement;

public class Demenagement {
	public static void main(String[] args) {
		//Déclaration des constantes et des variables
		int cartonsDepart = 34;
		int contenanceCamion = 9;
		int cartonsCamion = 0;
		int cartonsArrivee = 0;
		
		
		//Reste t-il des cartons au départ
		while  (cartonsDepart > 0) {
			
			//Chargement du camion
			while (cartonsDepart > 0 && cartonsCamion < contenanceCamion) {
				cartonsDepart -= 1;
				cartonsCamion += 1;
			}
			
			//Afficher les cartons dans le camion
			System.out.println("Le camion contient " + cartonsCamion);
			
			//Déchargement du camion
			while (cartonsCamion > 0) {
				cartonsCamion -= 1;
				cartonsArrivee += 1;
			}
		}
		//Afficher les cartons  à l'arrivée
		System.out.println("Il y a  " + cartonsArrivee + " cartons à l'arrivée");
	}
}
