package week3;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
        getTranslatedWords();
        getNameAdnAge();
    }
        public static Map<String, String> getTranslatedWords() {
            Map<String, String> translatedWords = new HashMap<>();
            translatedWords.put("Abajo", "Down");
            translatedWords.put("Hola", "Hi");
            translatedWords.put("Adios", "Bye");

            System.out.println("TRANSLATED WORDS: " + translatedWords);

            if (translatedWords.containsKey("Hola")) {
                System.out.println("Hola is in there!");
            }

            translatedWords.put("Abajo", "Under");
            System.out.println("PRINT CHANGED WORD: " + translatedWords.get("Abajo"));

            System.out.println("VALUES ONLY: " + translatedWords.values());

            for (String keys : translatedWords.keySet()) {
                System.out.println("KEYS ONLY: " + keys);
            }

            for (String key : translatedWords.keySet()) {
                System.out.println(key + " translates to " + translatedWords.get(key) + " in English.");
            }
            return translatedWords;
        }

        public static Map<String, Integer> getNameAdnAge() {
            Map<String, Integer> nameAndAge = new HashMap<>();
            nameAndAge.put("Santorio", 5);
            nameAndAge.put("Amado", 4);
            nameAndAge.put("Myles", 30);
            nameAndAge.put("Rosario", 29);

            System.out.println("Here is all of out names and ages: " + nameAndAge);

            System.out.println("My oldest child is " + nameAndAge.get("Santorio") + " years old.");

            nameAndAge.put("Myles", 31);
            System.out.println("Myles turns " + nameAndAge.get("Myles") + " years old in a few days.");

            nameAndAge.remove("Rosario", 29);
            for (String name : nameAndAge.keySet()) {
                System.out.println(name + " is " + nameAndAge.get(name) + " years old.");
            }
            return nameAndAge;
        }
        public static Map<String, Pet> getOwnerAndPet(){
            Map<String, Pet> ownerAndPet = new HashMap<>();
        }

}
