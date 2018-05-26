import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        scanner.close();
        String newStr = myString.replace("?", "HELLO");
        String newStr1 = newStr.replace("#", "");
        System.out.println(newStr1);
    }
}