package level3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isLeapYear = year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        System.out.println("Year is a Leap Year? " + isLeapYear);

        scanner.close();
    }
}
