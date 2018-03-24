package Zadania;

import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        Random random = new Random();
        String number = "" + Math.abs(random.nextInt());
        int length = number.length();
        int sum =0;
        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt("" + number.charAt(i));
        }
        System.out.println("Numer: " + number + ", Suma cyfr: " + sum);
    }
}
