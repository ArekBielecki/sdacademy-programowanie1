package Zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
private static Scanner input = new Scanner(System.in);
private  static int[] array;

    public static void main(String[] args) {
       createArray();
        double average = Arrays.stream(array)
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);
    }
    private static void createArray(){
        System.out.println("Podaj wielkość tablicy: ");
        int number = Integer.parseInt(input.nextLine());
        array = new int[number];
        fillArrayWithNumbers();
    }

    private static void fillArrayWithNumbers(){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Wprowadź liczbę");
            array[i] = Integer.parseInt(input.nextLine());
        }
    }
}
