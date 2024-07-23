import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declares and assigns  a Scanner to get and read user input
       Scanner playerInput;
       playerInput = new Scanner(System.in);

       //Declares Variables
        String heroName;

        //Get User Input
        System.out.println("What is the SuperHero's Name?");
        heroName = playerInput.nextLine();

        //Print a welcome message
        System.out.println("Welcome, " + heroName + "!");

        //Declares and assigns a Scanner to get and read number input from user
        Scanner numberInput;
        numberInput = new Scanner(System.in);

        //Declares Variables
        double health;

        //Get User Input
        System.out.println("Whats the SuperHero's Health?(In decimal format)");
        health = numberInput.nextDouble();

        System.out.println("Welcome, " + heroName + " you have " + health + " HP!");

        //Integer Scanner
        Scanner intInput;
        intInput = new Scanner(System.in);

        int lives;

        System.out.println("How many lives do you want?");
        lives = intInput.nextInt();

        System.out.println("Welcome, " + heroName + " you have " + health + " HP, " + "and you have " + lives + " Lives Remaining!");

        Scanner inInput;
        inInput = new Scanner(System.in);

        int heroAgility;

        System.out.println("What is your hero's agility speed?");
        heroAgility = inInput.nextInt();

        System.out.println("Welcome, " + heroName + " you have " + health + " HP, " + "and you have " + lives + " Lives Remaining!, " + " and you have an agility speed of " + heroAgility + " miles per hour!");


        Scanner InputOne;
        InputOne = new Scanner(System.in);

        Scanner InputTwo;
        InputTwo = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.println("Type a Number: ");

        System.out.println("Type Another Number: ");

        numberOne = InputOne.nextInt();
        numberTwo = InputTwo.nextInt();

         int addedNumbers = numberOne + numberTwo;
         int subtractNumbers = numberOne - numberTwo;
         int multipliedNumbers = numberOne * numberTwo;
         int dividedNumbers = numberOne / numberTwo;

         System.out.println("Added Numbers = " + addedNumbers);
        System.out.println("Subtracted Numbers = " + subtractNumbers);
        System.out.println("Multiplied Numbers = " + multipliedNumbers);
        System.out.println("Divided Numbers = " + dividedNumbers);




    }
}
