package week2;

public class extraStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Rosario");
        sb.append(" ");
        sb.append("Miller-Canales");

        System.out.println(sb.toString());


        //I asked chatGPT for more exercises
        StringBuilder word = new StringBuilder("hello");
        word.reverse();
        System.out.println(word.toString());

        StringBuilder chat = new StringBuilder("Programming is fun!");
        chat.reverse();
        System.out.println(chat.toString());

        StringBuilder chatG = new StringBuilder("I am learning Java.");
        chatG.delete(4, 13);
        System.out.println(chatG.toString());

        StringBuilder chatGPT = new StringBuilder("Java is fun");
        chatGPT.insert(7, " very");
        System.out.println(chatGPT.toString());


    }
}
