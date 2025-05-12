package week6.miniExercises;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void makeSound(){
        System.out.println(getName()+ " makes excited noises when it's food is being prepped.");
    }

    @Override
    public String toString() {
        return
                "\nAnima Name       : " + getName() +
                "\nAnimal Species   : " + getSpecies();
    }
}
