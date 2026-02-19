public class Main {

    static int evenFibSum(int N) {
        int a = 0, b = 1;
        int sum = 0;

        for (int i = 0; i <= N; i++) {
            if (a % 2 == 0) {
                sum += a;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }

    public static void main(String[] args) {
        int N = 10;
        System.out.println("Sum of even Fibonacci numbers: " + evenFibSum(N));
    }
}
