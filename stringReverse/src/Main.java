import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (!text.equals("stop")) {

        String reverseText = getReverseText(text);
            System.out.println(reverseText);
            text = scanner.nextLine();
        }

    }

    private static String getReverseText(String text) {
        char[] textArray = text.toCharArray();
        StringBuilder reverseText = new StringBuilder();

        for (int i = textArray.length - 1; i >= 0 ; i--) {
            char symbol = textArray[i];
            reverseText.append(symbol);
        }
        return reverseText.toString();
    }
}