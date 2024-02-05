package practice.string;
import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        //String text = "Это просто текст, для примера работы программы";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;

        for (int start = 0; start >= 0; start++) {
            if (text.isEmpty()) {
                return "";
            }
            int end = text.indexOf(' ', start);
            if (end >= 0) {
                stringBuilder.append("(" + index + ") ").append(text.substring(start, end)).append(" ");
                index++;
                start = end;
            }
            if (end == -1) {
                stringBuilder.append("(" + index + ") ").append(text.substring(start));
                break;
            }
        }
        return stringBuilder.toString();
    }
}
