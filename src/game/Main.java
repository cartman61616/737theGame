package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables
		String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
		String boss1 = "Ticketmaster";
		String boss2 = "TSA";
		String boss3 = "Buckminster Staff";
		String finalBoss = "HoB Staff";
		int boss1Health = 75;
		int boss2Health = 85;
		int boss3Health = 90;
		int finalBossHealth = 100;
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 15;

		// Player variables
		int health = 100;
		int mana = 100;
		int attackDmg = 20;
		int numPizzaSlices = 3;
		int numBeers = 3;
		int beerManaAmount = 20;
		int pizzaSliceHealAmount = 30;
		int pizzaSliceDropChance = 30; // Percentage
		int beerDropChance = 30;

		boolean running = true;

		System.out.println("Welcome to 737 the Game!");
		System.out.println("The journey to HomeTown ThrowDown!");

		// Label
		GAME:
			while (running) {
				System.out.println("--------------------------------------");
				
				System.out.println("Please choose your starting point");
				System.out.println("1. Los Angeles, California");
				System.out.println("2. Atlanta, Georgia");
				System.out.println("3. New York, New York");
				System.out.println("4. Minneapolis, Minnesota");
				System.out.println("5. Brunswick, Maine");
				String input = in.nextLine();
				if (input.equals("1")) {
					// need to implement
				} else if (input.equals("2")) {
					// need to implement
				} else if (input.equals("3")) {
					// need to implement
				} else if (input.equals("4")) {
					// need to implement
				} else if (input.equals("5")) {
					// need to implement
				} else {
					System.out.println("That isn't a valid city. Contact the lazy developer to add it");
				}
				
				int enemyHealth = rand.nextInt(maxEnemyHealth);
				String enemy = enemies[rand.nextInt(enemies.length)];
				System.out.println("\t# " + enemy + " has appeared! #\n");

				while (enemyHealth > 0) {
					System.out.println("\tYour HP: " + health);
					System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1. Attack");
					System.out.println("\t2. Use Beer Powers");
					System.out.println("\t3. Eat Pizza");
					System.out.println("\t4. Drink a Beer");
					System.out.println("\t5. Run");

					String input = in.nextLine();
					if (input.equals("1")) {
						int damageDealt = rand.nextInt(attackDmg);
						int damageTaken = rand.nextInt(enemyAttackDamage);

						enemyHealth -= damageDealt;
						health -= damageTaken;

						System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
						System.out.println("\t> You recieved " + damageTaken + " in retaliation");

						if (health < 1) {
							System.out.println("\t You have taken too much damage, you are too weak to go on");
							break;
						}
					} else if (input.equals("2")) {
						//need to implement
					} else if (input.equals("3")) {

						if (numPizzaSlices > 0) {
							health += pizzaSliceHealAmount;
							numPizzaSlices--;
							System.out.println("\t> You ate a slice of pizza, healed for: " + pizzaSliceHealAmount + "."
									+ "\n\t> You now have " + health + "HP."
									+ "\n\t> You now have " + numPizzaSlices + " health potions left.\n");
						} else {
							System.out.println("\t> You have no pizza left, defeat enemies for a chance to get one");
						}

					} else if (input.equals("6")) {
						//need to implement
					} else if (input.equals("5")) {
						System.out.println("\t> You run away from the " + enemy);
						continue GAME;
					} else {
						System.out.println("\tInvalid command");
					}
				}
				if (health < 1) {
					System.out.println("You limp out of the dungeon, weak from battle.");
					break;
				}
				System.out.println("--------------------------------------");
				System.out.println(" # " + enemy + " was defeated! # ");
				System.out.println(" # You have " + health + "HP left # ");
				// If the random number is less than 50 it drops
				if (rand.nextInt(100) < pizzaSliceDropChance) {
					numPizzaSlices++;
					System.out.println(" # The " + enemy + " dropped a health potion. # ");
					System.out.println(" # You now have " + numPizzaSlices + " health potion(s). # ");
				}
				System.out.println("--------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1. Continue fighting");
				System.out.println("2. Exit dungeon");
				String input = in.nextLine();

				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("invalid command");
					input = in.nextLine();

				}
				if (input.equals("1")) {
					System.out.println("You continue your adventure.");
				} else if (input.equals("2")) {
					System.out.println("You exit the dungeon.");
					break;
				}
			}
		System.out.println("######################################");
		System.out.println("# Thank you for playing 737 the game #");
		System.out.println("######################################");
	}
}