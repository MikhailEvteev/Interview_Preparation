package HomeWork3_4;

import java.util.Arrays;

public class Prime {

    private boolean prime[];

    public Prime(int number) {
        prime = new boolean[number + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i*i < number ; i++) {
            if (prime[i]) {
                for (int j = i*i; j < number; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public boolean check(int number) {
        return prime[number];
    }
}
