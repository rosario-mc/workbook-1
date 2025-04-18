package week2;

import java.util.Scanner;

public class temperatureConverter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //celcius or fahrenheit
        String degreeOption = getDegreeOption("What option would you like to choose, 1: Celsius to Fahrenheit or 2: Fahrenheit to Celsius?: ");

        //temp
        double temp = getTemp("What is the temperature?: ");

        //convert
        //double convertedTemp = convertTemp(degreeOption , temp);

        //display

        //kelvin
        String optionExtra = getKelvinYN("Would you like to see it converted in Kelvin? (Y/N): ");
        //double kelvinConvert = getKelvin(convertedTemp);

        scanner.close();
    }
    public static String getDegreeOption(String message){
        System.out.println(message);
        String degreeOption = scanner.nextLine();
        return degreeOption;
    }

    public static double getTemp(String prompt){
        System.out.println(prompt);
        double temp = scanner.nextDouble();
        return temp;
    }

    //public static double convertTemp(String degreeOption, double temp){
       // double convertTempCF = (temp - 32) * ;
        //double convertTempFC =;
    //}

    public static double displayConversion(double convertedTemp){
        System.out.println("This is the converted temperature: " + convertedTemp);
        return convertedTemp;
    }

    public static String getKelvinYN(String question){
        System.out.println(question);
        String answer = scanner.nextLine();
        return answer;
    }

   // public static double getKelvin(double convertTemp){

    //}
}
