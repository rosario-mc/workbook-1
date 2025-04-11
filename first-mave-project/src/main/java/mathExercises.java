public class mathExercises {
    public static void main(String[] args) {

        //1. Math.abs(x)
        int var = -45;
        System.out.println(Math.abs(var));

        //2.Math.max(x,y)
        System.out.println(Math.max(3.5, 7.8));

        //3.Math.min(x,y)
        System.out.println(Math.min (99, 23));

        //4.Math.floor(x)
        double nb = 8.9;
        System.out.println(Math.floor(nb));

        //5.Math.ceil(x)
        double nr2 = 5.2;
        System.out.println(Math.ceil(5.2));

        //6.Math.round(x)
        double nr3 = 9.6;
        System.out.println(Math.round(9.6));

        //Random # 0-100
        int randomInt = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomInt);

        //7.Combo
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;


        System.out.println(Math.abs(morningTemp - afternoonTemp));
        System.out.println(Math.max(morningTemp, afternoonTemp));
        System.out.println(Math.min(morningTemp, afternoonTemp));
        System.out.println(Math.round(afternoonTemp));
        System.out.println(Math.floor(morningTemp));

        //1.BONUS LEVEL IT UP
        double price = 10.876;
        System.out.printf("%.2f", price );

        double price3 = 10.876;
        double roundedNr = (double) Math.round(price3 * 100) / 100;
        System.out.println(roundedNr);

        //2.Time Challenge with Ceil
        int seconds = 320;
        double amountMin=  seconds / 60;

        System.out.println("Full amount of minutes: " + amountMin);
        System.out.println(Math.ceil(amountMin));

        //3. Rounding Down $
        double price1 = 3.87;
        System.out.println(Math.nextDown(price1));





    }
}
