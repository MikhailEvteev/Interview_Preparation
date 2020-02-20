package HomeWork3_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeAlgorithm {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] era = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println(Arrays.toString(era));
        }


    }
}
