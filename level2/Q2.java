package level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double areaInSqCm = 0.5 * base * height;
        double areaInSqIn = areaInSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);

        scanner.close();
    }
}
