package week2;

public class pApp {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Alex");

        p.setAge(5);

        p.setFavoriteColor("blue");

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor() + ".");

    }
}
