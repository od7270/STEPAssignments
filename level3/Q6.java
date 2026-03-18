package level3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int workingNumber = Math.abs(number);

        int digitCount = 0;
        int tempNumber = workingNumber;
        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                digitCount++;
                tempNumber = tempNumber / 10;
            }
        }

        int[] digits = new int[digitCount];
        int index = 0;
        if (workingNumber == 0) {
            digits[index] = 0;
        } else {
            while (workingNumber != 0) {
                digits[index] = workingNumber % 10;
                index++;
                workingNumber = workingNumber / 10;
            }
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
