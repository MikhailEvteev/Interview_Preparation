package HomeWork3_4;



public class PrimeAlgorithm {
    public static void main(String[] args) {

        int N = 100;
        Prime prime = new Prime(N);
        for (int i = 0; i < N; i++) {
            if (prime.check(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
