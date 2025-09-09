package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        count = multiples();
        System.out.println(count);
    }

    private static int multiples() {
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
}
