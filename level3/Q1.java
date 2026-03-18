package level3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        scanner.close();
    }
}
