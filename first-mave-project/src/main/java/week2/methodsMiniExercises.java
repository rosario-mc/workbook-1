package week2;

public class methodsMiniExercises {
    public static void main(String[] args){

        //void = not giving anything back
        // public static (int/boolean/etc) = gives something back

        printWelcome();
        displayPlayerName("Rosario");
        showLevel(3);
        showLevel(5);
        attack("Rosario" , "Player 2");
        attack("Player 3" , "Rosario");
        foundItem("Rosario" , "sword");
        foundItem("Player 2" , "shield");
        foundItem("Player 3" , "pizza");
        castSpell("Player 2" , "fireball" , 25);
        castSpell("Rosario" , "healing spell" , 5);
        gameOver("Player 2");
        displayInventory("Rosario" , 100);
        enterDungeon("Rosario" , "THE DUNGEON");
        enterDungeon("Player 3" , "Dirty Dungeon");
        victoryDance("Rosario");


    }
    public static void printWelcome(){
        System.out.println("Welcome to the game!");
    }

    public static void displayPlayerName(String playerName) {
        System.out.println("Player joined: " + playerName);
    }

    public static void showLevel(int level){
        System.out.println("Level: " + level);
    }

    public static void attack(String attacker, String target){
        System.out.println(attacker + " attacks " + target + "!");
    }

    public static void foundItem(String player, String item){
        System.out.println(player + " found a " + item + "!");
    }

    public static void castSpell(String wizard, String spellName, int manaCost){
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + " mana!");
    }

    public static void gameOver(String player){
        System.out.println("GAME OVER for " + player);
    }

    public static void displayInventory(String player, int itemCount){
        System.out.println(player + " has " + itemCount + " items in inventory.");
    }

    public static void enterDungeon(String player, String dungeonName){
        System.out.println(player + " bravely enters the " + dungeonName + ".");
    }

    public static void victoryDance(String player){
        System.out.println(player + " does a little victory dance!");
    }
}
