public class bonusTwoOperators {
    public static void main(String[] args) {

        //1
        int x = 5;
        double price = 5.99;
        char grade = 'A';

        System.out.println("//1: " + x + "," + price + "," + grade + ".");

        //2
        int y = 4;

        System.out.println(x + y);

        //3

        System.out.println(x / y);

        //4
        int a = 6;
        double b = 2.5;
        double doubleResult = a / b;
        System.out.println("//4 /: " + doubleResult);

        //5
        int age = 29;
        System.out.println("//5 In ten years from now, I will be " + age + 10);

        //6
        byte myByte = 100;
        int result1 = (byte) (myByte + 28);
        System.out.println("//6 " + result1);

        //7
        double value = 5.7;
        int i = (int) value;
        System.out.println("//7 " + value + "," + i);


        //8
        float decimal = 3.14F;
        int u = 3;
        double doubleResults = decimal * u;
        System.out.println("//8 " + doubleResults);

        //9
        char letter = 'A';
        letter += 1 ;
        System.out.println("// 9 " + letter);

        //10 division
        int z = 9;
        int k = 2;
        System.out.println("//10 " + (z / k));

        //10 module
        System.out.println("//10 " + (z % k));

        //11
        double weightLbs = 131.4;
        double heightInches = 60;
        double bmi = (weightLbs * 703) / (heightInches * heightInches);
        System.out.println("// 11 BMI (US Units) = " + bmi);


        //12
        double e = 5;
        double q = 6;
        double c = 1;
        System.out.println("//12 " + (e + q + c) / 3);

        //13
        int ab = 2;
        int bb = 3;

        ab += 1;
        System.out.println("// 13 " + ab);

        bb *= 2;
        System.out.println("// 13 " +bb);

        ab /= 3;
        System.out.println("// 13 " +ab);

        bb *= 4;
        System.out.println("// 13 " +bb);

        //14
        short num = 30000;
        short resultShort = (short) (num * 2);
        System.out.println("// 14 " + resultShort);
        // prints -5536
        int results = num * 2;
        System.out.println("//14 " + results);

        //15
        double price2 = 10.99;
        int quantity = 5;
        int totalCost = (int) price2 *  quantity;
        System.out.println("//15 " + totalCost);

        //16
        int v = 130;
        byte vByte = (byte) v;
        System.out.println("//16 " + vByte);

        //17
        char letter1 = 'z';
        char newLetter  = (char) (letter1 - 2);
        System.out.println("//17 " + newLetter);

        //18
        long value1 = 2000000000;
        long newValue = value1 + 1000000000;
        System.out.println("//18 " + newValue);

        //19
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println("//19 " + area);



    }
}
