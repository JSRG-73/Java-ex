package exercises;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static double calculator(int P, double r, int n, int t) {
        return P * Math.pow(1 + (r / n), n * t);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int exit;
        int P, n, t;
        double r, A;

        while (true) {
            System.out.print("\nWelcome to Compound Interest Calculator\n\nPlease enter the necessary data.\nInitial amount of the investment or loan: ");
            P = in.nextInt();
            System.out.print("Annual interest rate (in percentage): ");
            r = in.nextDouble() / 100; 
            System.out.print("Number of compounding periods per year: ");
            n = in.nextInt();
            System.out.print("Time in years: ");
            t = in.nextInt();

            for (int i = 1; i <= t; i++) {
                A = calculator(P, r, n, i);
                System.out.printf("Year %d\n", i);
                System.out.printf("Initial amount: %.2f\n", (double) P);
                System.out.printf("Interest earned: %.2f\n", A - P);
                System.out.printf("Total amount: %.2f\n\n", A);
            }

            System.out.println("\nPress 1 to calculate again, press 2 to exit: ");
            exit = in.nextInt();
            if(exit==1)for (int i = 0; i < 50; i++) {
                System.out.println(); 
            }
            if (exit != 1) break;
        }

        in.close();
    }
}
