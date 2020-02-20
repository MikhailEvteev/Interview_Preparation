package HomeWork3_2;

import java.util.Scanner;

public class FibonacciNumbersCalculation {

    public static void main(String[] args) {

        System.out.println("Введите размер n: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[]fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n ; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n ; i++) {
            System.out.println(fib[i]);
        }
    }
}
