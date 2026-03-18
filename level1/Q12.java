import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double number = scanner.nextDouble();

            if (number <= 0 || index == values.length) {
                break;
            }

            values[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
        }
        System.out.println("Sum of all numbers is " + total);

        scanner.close();
    }
}
