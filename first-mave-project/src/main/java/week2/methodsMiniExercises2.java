package week2;

import java.util.Scanner;

public class methodsMiniExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = getPlayerTitle("Rosario");
        System.out.println("Title: " + title);

        int originalXP = 150;
        int doubledXP = doubleXP(originalXP);
        System.out.println("Original XP: " + originalXP + ", Doubled XP: " + doubledXP);

        int threshold = 200;
        boolean leveldUp = hasLeveledUp(doubledXP, threshold);
        if (leveldUp) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding...");
        }

        System.out.println("Dice Rolls : ");
        System.out.println(rollDice());
        System.out.println(rollDice());
        System.out.println(rollDice());

        int damage = calculateDamage(10 , 8);
        System.out.println("Damage dealt: " + damage);

        boolean b1 = canOpenChest(true , true);
        boolean b2 = canOpenChest(false , false);
        boolean b3 = canOpenChest(true , false);
        boolean b4 = canOpenChest(false , true);
        System.out.println("Can open chest combinations: ");
        System.out.println(b1 + "|" + b2 + "|" + b3 + "|" + b4);
    }

    public static String getPlayerTitle(String name) {
        return "Princess " + name;
    }

    public static int doubleXP(int xp){
        return xp * 2;
    }
   public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
    }
    public static int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }
    public static int calculateDamage(int strength, int enemyDefense){
        int damage = (strength * 2) - enemyDefense;
        return Math.max(damage, 0);
    }
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken){
        if(hasKey || lockIsBroken){
            return true;
        }
        return false;
    }
}
