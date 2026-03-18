package level3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }

        System.out.println("Year is a Leap Year? " + isLeapYear);

        scanner.close();
    }
}
