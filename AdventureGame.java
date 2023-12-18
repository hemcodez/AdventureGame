import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args){

        //Declare an array called enemies & give them health
        String[] enemies = {"Skeleton", "Orc", "Goblin", "Troll"};

        int[] enemyHealth = new int[4];
        enemyHealth[0] = 30;
        enemyHealth[1] = 115;
        enemyHealth[2] = 50;
        enemyHealth[3] = 100;


        //Declare an int to hold health of player
        int health = 100;

        //Display message to player welcoming to the game and they are entering a dungeon.
        System.out.println("> Welcome to Dungeon Warriors!");

        //Ask the user if they want to enter the dungeon
        System.out.println("DO YOU WISH TO ENTER THE DUNGEON?");

        //Get answer from user
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        if (answer.equals("Yes")) {
            //divider
            System.out.println("-------------------------------");

                System.out.println("> You are now entering a dungeon.");

                //create instance of Random class
                Random rand = new Random();

                //Generate random integers in range 0 to 3
                int randomEnemy = rand.nextInt(3);

                //Display the enemy to the player
                System.out.println("> Oh no! A " + enemies[randomEnemy] + " has appeared!");

                System.out.println("> What do you wanna do?");
                System.out.println("Attack  ||  Use a Potion  ||  Or Run");

                //Get input from the player
                String action = input.next();

                if (Objects.equals(action, "Attack")) {
                    System.out.println("You attacked the " + enemies[randomEnemy]);


                } else if (Objects.equals(action, "Use a Potion")) {
                    System.out.println("You used a potion");

                } else if (Objects.equals(action, "Run")) {
                    System.out.println("You retreated from combat.");
                }

        } else if (answer.equals("No")) {
            System.out.println("Weakling. Come back when you're not afraid.");

        }
    } //end main
} //end class
