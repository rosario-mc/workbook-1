import java.util.Scanner;

public class fridayMiniExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Say Hello
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the game!");

        //2. Age in Dog Yrs
        System.out.print("What is your age? : ");
        double age = scanner.nextDouble();
        scanner.nextLine();

        double dogYears = age * 7;
        System.out.println("You are " + dogYears + " years old in dog years!");

        //3.Dice Roll
        int randomDiceRoll =(int) (Math.random() * 6);
        System.out.println("Dice roll: " + randomDiceRoll);

        //4.Hero Stats
        System.out.print("What is your superhero name?: ");
        String hName = scanner.nextLine();


        System.out.print("What is your strength?: ");
        int strength = scanner.nextInt();

        System.out.print("What is your agility?: ");
        int agility = scanner.nextInt();

        System.out.printf("Your Superhero name: %s | Strength: %s | Agility: %s" , hName , strength , agility);
        System.out.println();

        //5.Level Up!
        System.out.print("What is your current level?: ");
        int level = scanner.nextInt();
        System.out.println("You leveled up! You are now level " + (level + 1) + "!");

        //6.Coin Calculator
        System.out.print("How many gold coins did you find?: ");
        int goldCoins = scanner.nextInt();
        System.out.print("How many silver coins did you find?: ");
        int silverCoins = scanner.nextInt();
        int totalGold = goldCoins * 10;
        System.out.printf("You have %s gold coins total score & %s silver coins total score!", totalGold , silverCoins);

        //7.Odd or Even
        int randomDice =(int) (Math.random() * 6);
        System.out.println(randomDice);
        if(randomDice % 2 == 0){
            System.out.println(randomDice + ": Even");
        } else {
            System.out.println(randomDice + ": Odd");
        }

        //8.Critical Hit Chance
        System.out.print("What is your luck stat? (0-100)?: ");
        double luckStat = scanner.nextDouble();
        scanner.nextLine();
        if(luckStat > 50) {
            System.out.println("Critical Hit!");
        } else{
            System.out.println("Normal Hit");
        }

        //9.Character Class Check
        System.out.print("What is your character class? (Warrior or Mage): ");
        String characterClass = scanner.nextLine();
        System.out.print(characterClass);
        if(characterClass.equals("Warrior")){
            System.out.println("Your starting weapon is a SPEAR!");
        }
        if(characterClass.equals("Mage")){
            System.out.println("Your starting weapon is a WAND!");
        }

        //10.Magic Number Guess
        int magicNum= 8;
        System.out.print("Guess the magic number between 1-10!: ");
        int numberGuessed = scanner.nextInt();
        if(numberGuessed == magicNum){
            System.out.print("You got it!");
        } else {
            System.out.println("Better luck next time!");
        }

        //11.Speed Trap
        System.out.print("What is your speed?: ");
        double speed = scanner.nextDouble();
        if(speed > 100){
            System.out.print("Too fast! Slow down!");
        } else{
            System.out.print("Safe speed");
        }

    }
}
