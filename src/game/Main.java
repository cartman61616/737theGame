package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables
		String[] stageOneEnemies = {"Computer virus", "Different Time Zone"};
		String[] stageTwoEnemies = {"Cab Driver", "Sky Captain", "Loud Person in Line"};
		//String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" };
		//String[] finalLegEnemies = {"Inexperienced crowdsurfer"};
		String boss1 = "Ticketmaster";
		String boss2 = "TSA";
		//String boss3 = "Getting on the B line with a Suitcase";
		//String boss4 = "Buckminster Staff";
		//String finalBoss = "HoB Staff";
		int boss1Health = 75;
		int boss2Health = 85;
		//int boss3Health = 90;
		//int boss4Health = 95;
		//int finalBossHealth = 100;
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 15;
		String playerName;
		boolean loginCredentials = false;
		boolean ticketInHand = false;

		// Player variables
		int health = 100;
		int beerPoints = 65;
		int attackDmg = 20;
		int numPizzaSlices = 3;
		int numBeers = 3;
		int beerPointsHealAmount = 20;
		int pizzaSliceHealAmount = 30;
		int pizzaSliceDropChance = 30; //Percentage
		int beerDropChance = 30; //Percentage
		int loginDropChance = 45; //Percentage
		int ticketDropChance = 45; //Percentage

		boolean running = true;

		System.out.println("Welcome to 737 the Game!");
		System.out.println("The journey to HomeTown ThrowDown!");
		System.out.println("--------------------------------------");
		System.out.println("Press enter to continue");
		String input = in.nextLine();
		System.out.println("Please enter your Name");
		playerName = in.nextLine();

		System.out.println(playerName + " please choose your starting point");
		System.out.println("1. Los Angeles, California");
		System.out.println("2. Atlanta, Georgia");
		System.out.println("3. New York, New York");
		System.out.println("4. Minneapolis, Minnesota");
		System.out.println("5. Brunswick, Maine");
		input = in.nextLine();
		if (input.equals("1")) {
			System.out.println(playerName + ". You have chosen Los Angeles.");
			System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
			System.out.println("You must defeat enemies to obtain the login credentials to summon the dreaded Ticketmaster");
		} else if (input.equals("2")) {
			System.out.println(playerName + ". You have chosen Atlanta.");
			System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
			System.out.println("You must defeat enemies to obtain the login credentials to summon the dreaded Ticketmaster");
		} else if (input.equals("3")) {
			System.out.println(playerName + ". You have chosen New York.");
			System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
			System.out.println("You must defeat enemies to obtain the login credentials to summon the dreaded Ticketmaster");
		} else if (input.equals("4")) {
			System.out.println(playerName + ". You have chosen Minneapolis.");
			System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
			System.out.println("You must defeat enemies to obtain the login credentials to summon the dreaded Ticketmaster");
		} else if (input.equals("5")) {
			System.out.println(playerName + ". You have chosen Brunswick.");
			System.out.println("As you begin your journey to the ThrowDown the first quest is obtaining tickets");
			System.out.println("You must defeat enemies to obtain the login credentials to summon the dreaded Ticketmaster");
		} else {
			System.out.println(playerName + ". That isn't a valid city. Contact the lazy developer to add it");
		}

		System.out.println("\n--------------------------------------\n");
		//STAGEONE:
		while (running) {
			while (!loginCredentials) {
				int enemyHealth = rand.nextInt(maxEnemyHealth);
				String stageOneEnemy = stageOneEnemies[rand.nextInt(stageOneEnemies.length)];
				System.out.println("\t# " + stageOneEnemy + " has appeared! #\n");

				while (enemyHealth > 0) {
					System.out.println("\t" + playerName + "'s HP: " + health);
					System.out.println("\t" + playerName + "'s BP: " + beerPoints);
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
									+ " in 3 seconds!");
							System.out.println("\t> You feel your strength increasing causing you to attack the enemy for 25 damage!");
							enemyHealth -= 25;
							beerPoints -= 15;
							System.out.println("\t> You now have " + beerPoints + " left.");
						} else if (input.equals("2")) {
							System.out.println("\t> You drink a Brick Red!"
									+ "Using the power of this rare beer you gain 25 beer points!");
							beerPoints += 25;
							System.out.println("\t> You now have " + beerPoints + "!");
						} else if (input.equals("3")) {
							System.out.println("\t> You utilize the mysterious power of beer to strike you enemy for half of it's health!");
							int beligerantStrike = (int) (.5 * enemyHealth);
							enemyHealth -= beligerantStrike;
							beerPoints -= 30;
							System.out.println("\t> You now have " + beerPoints + " left.");
						} else if (input.equals("4")) {
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
									+ "\n\t> You now have " + numPizzaSlices + " slices of pizza left.\n");
						} else {
							System.out.println("\t> You have no pizza left, defeat enemies for a chance to get one");
						}
					} else if (input.equals("4")) {

						beerPoints += beerPointsHealAmount;
						System.out.println("\t> You drink a beer replenishing your beer points!");
						System.out.println("\t> You now have " + beerPoints + "BP");
						System.out.println("\t> You now have " + numBeers + "beers left\n");

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
				if (rand.nextInt(100) < loginDropChance) {
					loginCredentials = true;
					System.out.println(" # Congratulations! You have obtained the log in credentials! # ");
				}
				System.out.println("--------------------------------------");

				if (loginCredentials) {
					System.out.println("You have obtained the log in credentials! The battle for Throwdown tickets truly begins");
					System.out.println("\t# The evil" + boss1 + " has been summoned! #\n");
					while (boss1Health > 0) {
						System.out.println("\t" + playerName + "'s HP: " + health);
						System.out.println("\t" + playerName + "'s BP: " + beerPoints);
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

							boss1Health -= damageDealt;
							health -= damageTaken;

							System.out.println("\t>You strike the " + boss1 + " for " + damageDealt + " damage");
							System.out.println("\t>You recieved " + damageTaken + " damage in retaliation");

							if (health < 1) {
								System.out.println("\tYou have taken too much damage, you are too weak to go on");
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
								System.out.println("\t>Using Heinzinger's Super Chugging Skill, you have chugged a beer"
										+ " in 3 seconds!");
								System.out.println("\t>You feel your strength increasing causing you to attack the enemy for 25 damage!");
								boss1Health -= 25;
								beerPoints -= 15;
								System.out.println("\t>You now have " + beerPoints + " left.");

							} else if (input.equals("2")) {

								System.out.println("\t>You drink a Brick Red!"
										+ "Using the power of this rare beer you gain 25 beer points!");
								beerPoints += 25;
								System.out.println("\t>You now have " + beerPoints + "!");

							} else if (input.equals("3")) {

								System.out.println("\t>You utilize the mysterious power of beer to strike you enemy for half of it's health!");
								int beligerantStrike = (int) (.5 * boss1Health);
								boss1Health -= beligerantStrike;
								beerPoints -= 30;
								System.out.println("\t>You now have " + beerPoints + " left.");

							} else if (input.equals("4")) {

								//no implementation needed. Returns to previous state.

							} else {

								System.out.println("Invalid entry you drunk!");

							}

						} else if (input.equals("3")) {

							if (numPizzaSlices > 0) {
								health += pizzaSliceHealAmount;
								numPizzaSlices--;
								System.out.println("\t>You ate a slice of pizza, healed for: " + pizzaSliceHealAmount + "."
										+ "\n\t>You now have " + health + "HP."
										+ "\n\t>You now have " + numPizzaSlices + " slices of pizza left.\n");

							} else {

								System.out.println("\t>You have no pizza left, defeat enemies for a chance to get one");

							}

						} else if (input.equals("4")) {

							beerPoints += beerPointsHealAmount;
							System.out.println("\t>You drink a beer replenishing your beer points!");
							System.out.println("\t>You now have " + beerPoints + "BP");
							System.out.println("\t>You now have " + numBeers + "beers left\n");

						} else {

							System.out.println("\tInvalid command");

						}
					}
					if (health < 1) {

						System.out.println("You limp away from the computer, weak from battle.");
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

			}

			while (!ticketInHand) {

				System.out.println("Your next quest has began! To board the plane to Throwdown you must defeat enemies to obtain your plane tickets!"); //begun?
				int enemyHealth = rand.nextInt(maxEnemyHealth);
				String stageTwoEnemy = stageTwoEnemies[rand.nextInt(stageTwoEnemies.length)];
				System.out.println("\t# " + stageTwoEnemy + " has appeared! #\n");

				while (enemyHealth > 0) {
					System.out.println("\t" + playerName + "'s HP: " + health);
					System.out.println("\t" + playerName + "'s BP: " + beerPoints);
					System.out.println("\t" + stageTwoEnemy + "'s HP: " + enemyHealth);
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

						System.out.println("\t> You strike the " + stageTwoEnemy + " for " + damageDealt + " damage");
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
									+ " in 3 seconds!");
							System.out.println("\t> You feel your strength increasing causing you to attack the enemy for 25 damage!");
							enemyHealth -= 25;
							beerPoints -= 15;
							System.out.println("\t> You now have " + beerPoints + " left.");
						} else if (input.equals("2")) {
							System.out.println("\t> You drink a Brick Red!"
									+ "Using the power of this rare beer you gain 25 beer points!");
							beerPoints += 25;
							System.out.println("\t> You now have " + beerPoints + "!");
						} else if (input.equals("3")) {
							System.out.println("\t> You utilize the mysterious power of beer to strike you enemy for half of it's health!");
							int beligerantStrike = (int) (.5 * enemyHealth);
							enemyHealth -= beligerantStrike;
							beerPoints -= 30;
							System.out.println("\t> You now have " + beerPoints + " left.");
						} else if (input.equals("4")) {
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
									+ "\n\t> You now have " + numPizzaSlices + " slices of pizza left.\n");
						} else {
							System.out.println("\t> You have no pizza left, defeat enemies for a chance to get one");
						}
					} else if (input.equals("4")) {

						beerPoints += beerPointsHealAmount;
						System.out.println("\t> You drink a beer replenishing your beer points!");
						System.out.println("\t> You now have " + beerPoints + "BP");
						System.out.println("\t> You now have " + numBeers + "beers left\n");

					} else {
						System.out.println("\tInvalid command");
					}
				}
				if (health < 1) {
					System.out.println("You limp out of the dungeon, weak from battle.");
					break;
				}
				System.out.println("--------------------------------------");
				System.out.println(" # " + stageTwoEnemy + " was defeated! # ");
				System.out.println(" # You have " + health + "HP left # ");
				// If the random number is less than 50 it drops
				if (rand.nextInt(100) < pizzaSliceDropChance) {
					numPizzaSlices++;
					System.out.println(" # The " + stageTwoEnemy + " dropped a slize of piece. # ");
					System.out.println(" # You now have " + numPizzaSlices + " slice(s) of pizza. # ");
				}
				if (rand.nextInt(100) < beerDropChance) {
					numBeers++;
					System.out.println(" # The " + stageTwoEnemy + " dropped a beer. # ");
					System.out.println(" # You now have " + numPizzaSlices + " beer(s). # ");
				}
				if (rand.nextInt(100) < ticketDropChance) {
					loginCredentials = true;
					System.out.println(" # Congratulations! You have obtained your Plane Ticket! # ");
				}
				System.out.println("--------------------------------------");

				if (ticketInHand) {
					System.out.println("You have obtained the Plane Ticket! Prepare to battle the TSA to take your flight to Boston");
					System.out.println("\t# The evil" + boss2 + " has been summoned! #\n");
					while (boss2Health > 0) {
						System.out.println("\t" + playerName + "'s HP: " + health);
						System.out.println("\t" + playerName + "'s BP: " + beerPoints);
						System.out.println("\t" + boss2 + "'s HP: " + boss1Health);
						System.out.println("\n\tWhat would you like to do?");
						System.out.println("\t1. Attack");
						System.out.println("\t2. Use Beer Powers");
						System.out.println("\t3. Eat Pizza");
						System.out.println("\t4. Drink a Beer");

						input = in.nextLine();
						if (input.equals("1")) {

							int damageDealt = rand.nextInt(attackDmg);
							int damageTaken = rand.nextInt(enemyAttackDamage);

							boss2Health -= damageDealt;
							health -= damageTaken;

							System.out.println("\t>You strike the " + boss2 + " for " + damageDealt + " damage");
							System.out.println("\t>You recieved " + damageTaken + " damage in retaliation");

							if (health < 1) {
								System.out.println("\tYou have taken too much damage, you are too weak to go on");
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
								System.out.println("\t>Using Heinzinger's Super Chugging Skill, you have chugged a beer"
										+ " in 3 seconds!");
								System.out.println("\t>You feel your strength increasing causing you to attack the enemy for 25 damage!");
								boss2Health -= 25;
								beerPoints -= 15;
								System.out.println("\t>You now have " + beerPoints + " left.");

							} else if (input.equals("2")) {

								System.out.println("\t>You drink a Brick Red!"
										+ "Using the power of this rare beer you gain 25 beer points!");
								beerPoints += 25;
								System.out.println("\t>You now have " + beerPoints + "!");

							} else if (input.equals("3")) {

								System.out.println("\t>You utilize the mysterious power of beer to strike you enemy for half of it's health!");
								int beligerantStrike = (int) (.5 * boss1Health);
								boss2Health -= beligerantStrike;
								beerPoints -= 30;
								System.out.println("\t>You now have " + beerPoints + " left.");

							} else if (input.equals("4")) {

								//no implementation needed. Returns to previous state.

							} else {

								System.out.println("Invalid entry you drunk!");

							}

						} else if (input.equals("3")) {

							if (numPizzaSlices > 0) {
								health += pizzaSliceHealAmount;
								numPizzaSlices--;
								System.out.println("\t>You ate a slice of pizza, healed for: " + pizzaSliceHealAmount + "."
										+ "\n\t>You now have " + health + "HP."
										+ "\n\t>You now have " + numPizzaSlices + " slices of pizza left.\n");

							} else {

								System.out.println("\t>You have no pizza left, defeat enemies for a chance to get one");

							}

						} else if (input.equals("4")) {

							beerPoints += beerPointsHealAmount;
							System.out.println("\t>You drink a beer replenishing your beer points!");
							System.out.println("\t>You now have " + beerPoints + "BP");
							System.out.println("\t>You now have " + numBeers + "beers left\n");

						} else {

							System.out.println("\tInvalid command");

						}
					}
					if (health < 1) {

						System.out.println("You limp away from the computer, weak from battle.");
						break;

					}

					System.out.println("--------------------------------------");
					System.out.println(" # " + boss2 + " was defeated! # ");
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
					System.out.println("In defeating the evil TSA Agents you have reached your flight"
							+ "to Boston and the HomeTown ThrowDown!"
							+ "Congratulations! Step two of your journey is now complete.");
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
			}
			System.out.println("######################################");
			System.out.println("# Thank you for playing 737 the game #");
			System.out.println("######################################");
		}
	}
}