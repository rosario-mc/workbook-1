package week2;

import java.util.Scanner;

public class fullNameGenerator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //first name
        String firstName = getFirstName();


        //middle name
        String middleName = getMiddleName();


        //last name
        String lastName = getLastName();


        //suffix
        String suffix = getSuffix();

        //full Name
        String fullName1 = buildFullName(firstName , middleName , lastName , suffix);

        //display
        String fullName = displayFullName(fullName1);


    }

        public static String getFirstName(){
            System.out.println("Enter your first name: ");
            String firstName = scanner.nextLine();
            firstName = firstName.trim();
            return firstName;
        }

        public static String getMiddleName(){
            System.out.println("Enter your middle name (PRESS ENTER IF NONE): ");
            String middleName = scanner.nextLine();
            middleName = middleName.trim();
            return middleName;
        }

        public static String getLastName(){
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            lastName = lastName.trim();
            return lastName;
        }

        public static String getSuffix(){
            System.out.println("Enter your suffix (PRESS ENTER IF NONE): ");
            String suffix = scanner.nextLine();
            suffix = suffix.trim();
            return suffix;
        }

        public static String buildFullName(String firstName , String middleName , String lastName , String suffix){
        String fullname1 = firstName;
        if(!middleName.isEmpty()){
            fullname1 += " " + middleName;
        }
        fullname1 += " " + lastName;
        if(!suffix.isEmpty()){
            fullname1 += ", " + suffix;
        }
        return fullname1;
        }

        public static String displayFullName(String fullName1){
            System.out.println("Your full name is: " + fullName1);
            return fullName1;
        }

}
