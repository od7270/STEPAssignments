package level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double perimeter = scanner.nextDouble();
        double side = perimeter / 4.0;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}
