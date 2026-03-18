import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println("Is the number " + number + " divisible by 5? " + divisibleBy5);

        scanner.close();
    }
}
