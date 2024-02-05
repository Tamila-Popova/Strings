package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }
      String regex1 = "(7)[0-9]{10}";
      String regex2 = "(8)[0-9]{10}";
      String regex3 = "[0-9]{10}";
      String number = input.replaceAll("[^0-9]", "");
      if (number.matches(regex3)) {
        number = "7" + number;
        System.out.println(number);
      }
      else if (number.matches(regex2)) {
        number = number.replace('8', '7');
        System.out.println(number);
      }
      else if (number.matches(regex1)) {
        System.out.println(number);
      }
      else if (!number.matches(regex3) && !number.matches(regex2) && !number.matches(regex1)){
        System.out.println("Неверный формат номера");
      }
    }
  }
}


