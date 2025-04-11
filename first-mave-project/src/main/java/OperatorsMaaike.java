public class OperatorsMaaike {
    public static void main(String[] args) {

        // + , - , / , %

        int nr1 = 9;
        int nr2= 2;
        int result;

        result = nr1 + nr2;
        System.out.println("+: " + result);

        result = nr1 - nr2;
        System.out.println("-: " + result);

        result = nr1 * nr2;
        System.out.println("*: " + result);

        //weird stuf w/ diviing ints - integer division
        double doubleResult = (double) nr1 / nr2;
        System.out.println("/: " + doubleResult);

        int nrOfEggs = 143;
        int boxesNeeded = nrOfEggs / 12;
        System.out.println("Boxes I need: " + boxesNeeded);


        /*
        float x = 1.0F;
        double y = 2.0;
        float z = x / y;
        float z = x / y; NOT ALLOWED BECAUSE X OVER Y IS A DOUBLE
         */

        // % MODULE
        nrOfEggs = 142;
        int boxSize = nrOfEggs / 12;
        int eggsLeft = nrOfEggs % boxSize;
        System.out.println("Eggs left: : " + eggsLeft);

        // post and pre ++ --
        int i = 4;
        System.out.println(i++); // first send the variable of the printing function and then increase
        System.out.println(++i); //first increase, and then send to print
        i++; // i = i + 1 //post/pre does not matter
        i--; // i = i - 1
        //post or pre is only relevant for other expresions

        //comparison operators < > <= >=, for equals we use ==, for not equals we use !=
        int j = 5;
        int k = 6;
        boolean eval = j < k;
        System.out.println(eval);

        System.out.println(j++ == k); // 5==6, then increases j to 6
        System.out.println(++j == k); // 7 ==6, first increase j to 7 then compares
    }
}
