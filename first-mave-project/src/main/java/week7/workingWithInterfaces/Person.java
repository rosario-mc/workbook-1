package week7.workingWithInterfaces;


public class Person implements Comparable <Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        int lastNameCompare = this.lastName.compareToIgnoreCase(o.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        int firstNameCompare = this.firstName.compareToIgnoreCase(o.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }
        return Integer.compare(this.age, o.age);
    }
}
