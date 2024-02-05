package practice.regex;
import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(splitTextIntoWords(text));

    }

    public static String splitTextIntoWords(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String regex = "[^A-z']+";
        String[] words = text.split(regex);
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i] + "\n");
        }
                return stringBuilder.toString().strip();

    }
}