package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables
		String[] stageOneEnemies = { "Computer virus", "Different Time Zone"};
		//String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
		//String[] finalLegEnemies = {"Inexperienced crowdsurfer"};
		String boss1 = "Ticketmaster";
		//String boss2 = "TSA";
		//String boss3 = "Getting on the B line with a Suitcase";
		//String boss4 = "Buckminster Staff";
		//String finalBoss = "HoB Staff";
		int boss1Health = 75;
		//int boss2Health = 85;
		//int boss3Health = 90;
		//int boss4Health = 95;
		//int finalBossHealth = 100;
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 15;
		int enemyCounter = 0;

		// Player variables
		int health = 100;
		int beerPoints = 100;
		int attackDmg = 20;
		int numPizzaSlices = 3;
		int numBeers = 3;
		int beerManaAmount = 20;
		int pizzaSliceHealAmount = 30;
		int pizzaSliceDropChance = 30; //Percentage
		int beerDropChance = 30; //Percentage

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
					System.out.println("You have chosen Los Angeles.");
					System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
					System.out.println("You must survive 2 enemies before you encounter the dreaded Ticketmaster");
				} else if (input.equals("2")) {
					System.out.println("You have chosen Atlanta.");
					System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
					System.out.println("You must survive 2 enemies before you encounter the dreaded Ticketmaster");
				} else if (input.equals("3")) {
					System.out.println("You have chosen New York.");
					System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
					System.out.println("You must survive 2 enemies before you encounter the dreaded Ticketmaster");
				} else if (input.equals("4")) {
					System.out.println("You have chosen Minneapolis.");
					System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
					System.out.println("You must survive 2 enemies before you encounter the dreaded Ticketmaster");
				} else if (input.equals("5")) {
					System.out.println("You have chosen Brunswick.");
					System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
					System.out.println("You must survive 2 enemies before you encounter the dreaded Ticketmaster");
				} else {
					System.out.println("That isn't a valid city. Contact the lazy developer to add it");
				}

				int enemyHealth = rand.nextInt(maxEnemyHealth);
				String stageOneEnemy = stageOneEnemies[rand.nextInt(stageOneEnemies.length)];
				System.out.println("\t# " + stageOneEnemy + " has appeared! #\n");

				STAGEONE:
				while (enemyCounter != 2) {
					while (enemyHealth > 0) {
						System.out.println("\tYour HP: " + health);
						System.out.println("\tYour BP: " + beerPoints);
						System.out.println("\t" + stageOneEnemy + "'s HP: " + enemyHealth);
						System.out.println("\n\tWhat would you like to do?");
						System.out.println("\t1. Attack");
						System.out.println("\t2. Use Beer Powers");
						System.out.println("\t3. Eat Pizza");
						System.out.println("\t4. Drink a Beer");

						input = in.nextLine();
						if (input.equals("1")) {

							int damageDealt = rand.nextInt(attackDmg);
							int damageTaken = rand.nextInt(enemyAttackDamage);

							enemyHealth -= damageDealt;
							health -= damageTaken;

							System.out.println("\t> You strike the " + stageOneEnemy + " for " + damageDealt + " damage");
							System.out.println("\t> You recieved " + damageTaken + " damage in retaliation");

							if (health < 1) {
								System.out.println("\t You have taken too much damage, you are too weak to go on");
								break;
							}
						} else if (input.equals("2")) {
							System.out.println("Which beer power do you want to use?");
							System.out.println("\t1. Heinzinger's Super Chugging Skill");
							System.out.println("\t2. Drink a Brick Red");
							System.out.println("\t3. Beligerant Strike");
							System.out.println("\t4. Return to previous menu");
							input = in.nextLine();
							if (input.equals("1")) {
								System.out.println("\t> Using Heinzinger's Super Chugging Skill, you have chugged a beer"
										+ "in 3 seconds!");
								System.out.println("You feel your strength increasing causing you to attack the enemy for 25 damage!");
								enemyHealth -= 25;
							} else if (input.equals("2")) {
								System.out.println("\t> You drink a Brick Red!"
										+ "Using the power of this rare beer you gain 25 beer points!");
								beerPoints += 25;
							} else if (input.equals("3")) {
								System.out.println("\t> You utilize the mysterious power of beer to strike you enemy for half of it's health!");
								int beligerantStrike = (int) (.5 * enemyHealth);
								enemyHealth -= beligerantStrike;
							} else if(input.equals("4")){
								//no implementation needed. Returns to previous state.
							} else {
								System.out.println("Invalid entry you drunk!");
							}
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
						} else {
							System.out.println("\tInvalid command");
						}
					}
					if (health < 1) {
						System.out.println("You limp out of the dungeon, weak from battle.");
						break;
					}
					System.out.println("--------------------------------------");
					System.out.println(" # " + stageOneEnemy + " was defeated! # ");
					System.out.println(" # You have " + health + "HP left # ");
					// If the random number is less than 50 it drops
					if (rand.nextInt(100) < pizzaSliceDropChance) {
						numPizzaSlices++;
						System.out.println(" # The " + stageOneEnemy + " dropped a slize of piece. # ");
						System.out.println(" # You now have " + numPizzaSlices + " slice(s) of pizza. # ");
					}
					if (rand.nextInt(100) < beerDropChance) {
						numBeers++;
						System.out.println(" # The " + stageOneEnemy + " dropped a beer. # ");
						System.out.println(" # You now have " + numPizzaSlices + " beer(s). # ");
					}
					enemyCounter++;
					System.out.println("--------------------------------------");
					System.out.println("What would you like to do now?");
					System.out.println("1. Continue your journey");
					System.out.println("2. Quit");
					input = in.nextLine();

					while (!input.equals("1") && !input.equals("2")) {
						System.out.println("invalid command");
						input = in.nextLine();
					}
					if (input.equals("1")) {
						System.out.println("You continue your adventure.");
					} else if (input.equals("2")) {
						System.out.println("You have arrived at the HomeTown ThrowDown. Enjoy seeing the Mighty Mighty Bosstones");
						break;
					}
				}
				System.out.println("As the second foe is defeated the battle for Throwdown tickets truly begins");
				System.out.println("\t# The evil" + boss1 + " has appeared! #\n");
				while (boss1Health > 0) {
					System.out.println("\tYour HP: " + health);
					System.out.println("\tYour BP: " + beerPoints);
					System.out.println("\t" + boss1 + "'s HP: " + boss1Health);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1. Attack");
					System.out.println("\t2. Use Beer Powers");
					System.out.println("\t3. Eat Pizza");
					System.out.println("\t4. Drink a Beer");

					input = in.nextLine();
					if (input.equals("1")) {

						int damageDealt = rand.nextInt(attackDmg);
						int damageTaken = rand.nextInt(enemyAttackDamage);

						enemyHealth -= damageDealt;
						health -= damageTaken;

						System.out.println("\t> You strike the " + boss1 + " for " + damageDealt + " damage");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation");

						if (health < 1) {
							System.out.println("\t You have taken too much damage, you are too weak to go on");
							break;
						}
					} else if (input.equals("2")) {
						System.out.println("Which beer power do you want to use?");
						System.out.println("\t1. Heinzinger's Super Chugging Skill");
						System.out.println("\t2. Drink a Brick Red");
						System.out.println("\t3. Beligerant Strike");
						System.out.println("\t4. Return to previous menu");
						input = in.nextLine();
						if (input.equals("1")) {
							System.out.println("\t> Using Heinzinger's Super Chugging Skill, you have chugged a beer"
									+ "in 3 seconds!");
							System.out.println("You feel your strength increasing causing you to attack the enemy for 25 damage!");
							enemyHealth -= 25;
						} else if (input.equals("2")) {
							System.out.println("\t> You drink a Brick Red!"
									+ "Using the power of this rare beer you gain 25 beer points!");
							beerPoints += 25;
						} else if (input.equals("3")) {
							System.out.println("\t> You utilize the mysterious power of beer to strike you enemy for half of it's health!");
							int beligerantStrike = (int) (.5 * enemyHealth);
							enemyHealth -= beligerantStrike;
						} else if(input.equals("4")){
							//no implementation needed. Returns to previous state.
						} else {
							System.out.println("Invalid entry you drunk!");
						}
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
					} else {
						System.out.println("\tInvalid command");
					}
				}
				if (health < 1) {
					System.out.println("You limp out of the dungeon, weak from battle.");
					break;
				}
				System.out.println("--------------------------------------");
				System.out.println(" # " + boss1 + " was defeated! # ");
				System.out.println(" # You have " + health + "HP left # ");
				// If the random number is less than 50 it drops
				if (rand.nextInt(100) < pizzaSliceDropChance) {
					numPizzaSlices++;
					System.out.println(" # The " + boss1 + " dropped a slize of piece. # ");
					System.out.println(" # You now have " + numPizzaSlices + " slice(s) of pizza. # ");
				}
				if (rand.nextInt(100) < beerDropChance) {
					numBeers++;
					System.out.println(" # The " + boss1 + " dropped a beer. # ");
					System.out.println(" # You now have " + numPizzaSlices + " beer(s). # ");
				}
				System.out.println("In defeating the evil TicketMaster you have secured your floor tickets"
						+ "to the HomeTown ThrowDown!"
						+ "Congradulations! Step one of your journey is now complete.");
				System.out.println("--------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1. Continue your journey");
				System.out.println("2. Quit");
				input = in.nextLine();

				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("invalid command");
					input = in.nextLine();

				}
				if (input.equals("1")) {
					System.out.println("You continue your adventure.");
				} else if (input.equals("2")) {
					System.out.println("You have arrived at the HomeTown ThrowDown. Enjoy seeing the Mighty Mighty Bosstones");
					break;
				}

			}
				System.out.println("######################################");
				System.out.println("# Thank you for playing 737 the game #");
				System.out.println("######################################");
	}
}