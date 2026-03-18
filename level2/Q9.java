package level2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int workingNumber = Math.abs(number);

        while (workingNumber != 0) {
            digits[index] = workingNumber % 10;
            index++;
            workingNumber = workingNumber / 10;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            int digit = digits[i];
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }

        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);

        scanner.close();
    }
}
