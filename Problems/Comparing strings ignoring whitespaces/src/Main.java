import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string1IgnoringWhitespaces = string1.replace(" ", "");
        String string2IgnoringWhitespaces = string2.replace(" ", "");

        System.out.println(string1IgnoringWhitespaces.equals(string2IgnoringWhitespaces));
    }
}