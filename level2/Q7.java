package level2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            double salaryInput = scanner.nextDouble();
            double yearsInput = scanner.nextDouble();

            if (salaryInput <= 0 || yearsInput < 0) {
                i--;
                continue;
            }

            salary[i] = salaryInput;
            yearsOfService[i] = yearsInput;
        }

        for (int i = 0; i < 10; i++) {
            double currentBonusRate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * currentBonusRate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("The total bonus payout is " + totalBonus);
        System.out.println("The total old salary is " + totalOldSalary);
        System.out.println("The total new salary is " + totalNewSalary);

        scanner.close();
    }
}
