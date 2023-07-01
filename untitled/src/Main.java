import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to check if it even or odd!");
        int num = Integer.parseInt(scanner.nextLine());

        while (num >= 0) {
            isEvenOrOdd(num);
            isOddOrEven(num);

          num = Integer.parseInt(scanner.nextLine());
        }


    }

    private static void isOddOrEven(int num) {
        if ((num & 1) == 0) {
            System.out.println("Number " + num + " is even!");
        } else {
            System.out.println("Number " + num + " is odd!");
        }
    }

    private static void isEvenOrOdd(int num) {
        int quotient = num/2;

        if (quotient*2 == num) {
            System.out.println("Number " + num + " is even!");
        } else {
            System.out.println("Number " + num + " is odd!");
        }
    }
}