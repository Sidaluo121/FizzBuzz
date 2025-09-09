package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        count = multiples(1000,3,5);
        System.out.println(count);
    }

    static int multiples() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            Boolean multipleOf3 = i % 3 == 0;
            Boolean multipleOf5 = i % 5 == 0;
            if (multipleOf3 || multipleOf5) {
                count++;
            }
        }
        return count;
    }
    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            Boolean multipleOfa = i % a == 0;
            Boolean multipleOfb = i % b == 0;
            if (multipleOfa || multipleOfb) {
                count++;
            }
        }
        return count;
    }
}
