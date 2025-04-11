import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Remove the ln to have print on same line
        System.out.println("Enter weight: ");
        double weight= scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();


        double bmi = weight / Math.pow(height, 2);
        System.out.println("Your BMI is: " + bmi);
    }
}
