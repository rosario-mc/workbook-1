package week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class stringAnalyzer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //input sentence
        String sentence = getSentence("Enter a sentence: ");

        //nr of characters
        int nrOfCharacters = getNrOfCharacters(sentence);

        //split & nr of words
        parseWordsAndDisplay(sentence);

        //display first & last
        char firstCharacter = getFirst(sentence);
        char lastCharacter = getLast(sentence);
        System.out.println(firstCharacter + ": is the first character of the sentence.");
        System.out.println(lastCharacter + ": is the last character of the sentence.");
        scanner.close();
    }

    public static String getSentence(String prompt) {
        System.out.println(prompt);
        String sentence = scanner.nextLine();
        return sentence;
    }

    public static int getNrOfCharacters(String sentence){
        int length = sentence.length();
        System.out.println("Number of characters in your sentence: " + length);
        return length;
    }

    public static void parseWordsAndDisplay(String wordLength){
        String[] wordCount = wordLength.split(" ");
        if(wordCount.length == 1 && wordCount[0].isBlank()){
            System.out.println("1 word count.");
        } else {
            System.out.println(wordCount.length + ": is the word count in your sentence.");
        }
    }

    public static char getFirst(String sentence){
        char firstCharacter = sentence.charAt(0);
        return firstCharacter;
    }

    public static char getLast(String sentence){
        char lastCharacter = sentence.charAt(sentence.length() -1);
        return lastCharacter;
    }
}
