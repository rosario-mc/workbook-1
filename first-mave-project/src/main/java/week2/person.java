package week2;

public class person {

    private String name;

    private int age;

    private String favoriteColor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            System.out.println("Age cannot be negative, setting to 0.");
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }


}
