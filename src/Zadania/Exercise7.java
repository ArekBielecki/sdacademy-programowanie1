package Zadania;

public class Exercise7 {
    public static void main(String[] args) {
        calculateSum(6);

    }

    private static void calculateSum(int limit) {
        int count = 1;
        int number = 0;
        int sum = 0;
        do {
            if (number == 0) {
                sum = ++number;
                count++;
            } else {
                sum = sum + ++number;
                count++;
            }
        } while (sum < limit);
        System.out.println("Suma: " + sum);
        System.out.println("Ilość liczb: " + count);
    }

}
