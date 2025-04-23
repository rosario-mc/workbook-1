package week2;

public class LoopingArrays {
    public static void main(String[] args) {

        //1. Print numbers with a for loop
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0; i <num.length; i++) {
            System.out.println(num[i]);
        }

        // 2. Count backwards with a while loop
        int i = 5;
        while(i > 0){
            System.out.println(i);
            i--;
        }

        //3. Greet each person
        String[] names = {"Alice", "Bob", "Charlie"};
        for(int j = 0; j < names.length; j++){
            System.out.println("Hello, " + names[j] + "!");
        }

        // 4. Calculate the total
        int[] numbers = {3, 5, 7, 2, 8};
        int sum = 0;

        for(int k = 0; k < numbers.length; k++){
            sum += numbers[k];
        }
        System.out.println("Total: " + sum);

        //5. Print only even numbers
        int [] givenArray = {4, 7, 10, 15, 18};
        for(int l = 0; l < givenArray.length; l++){
            if(givenArray[l] %2 ==0){
                System.out.println(givenArray[l]);
            }
        }

        //6. Stop at a certain value (while loop)
        int[] values = {1, 3, 5, 7, 9};


    }
}
