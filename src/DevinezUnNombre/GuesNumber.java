package DevinezUnNombre;

import java.util.Random;
import java.util.Scanner;

public class GuesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un numero");

		// creer un random pour la saisi de l'utilisateur

		int user = sc.nextInt();

		Random rand = new Random();

		// int bound;
		int randNumber = rand.nextInt(100) + 1;
		int invite;
		int attempt = 0;
		System.out.print("Devine un numero de 1 à 100: ");
		do {
			user = sc.nextInt();
			attempt++;
			if (user > randNumber) {
				System.out.println("Le numero est plus petit!");
			} else if (user < randNumber) {
				System.out.println("Le numero est plus grand!");
			}
		} while (user != randNumber && attempt < 5);
		if (user == randNumber) {
			System.out.println("Félicitations! vous avez deviné le bon numero en " + attempt + " tentatives.");
		} else {
			System.out.println("Vous avez perdu! Le nombre était " + randNumber);
		}
	}
}
