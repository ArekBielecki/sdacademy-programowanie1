import java.util.Random;
import java.util.Scanner;

public class BubbleSortingAlgorithm {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj wielkość tablicy: ");
        int size = input.nextInt();
        int[] array = createArray(size);
        printArray(array);
        sortArray(array);
        printArray(array);
    }

    private static int[] createArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static int[] sortArray (int[] array){
        int storeNumber;
        int arrayIndex;
        for (int i = 0; i < array.length; i++) {
            arrayIndex = i;
            try{
                for (int j = 0; j < array.length; j++) {
                    if (array[arrayIndex] > array[arrayIndex + j]) {
                        storeNumber = array[arrayIndex];
                        array[arrayIndex] = array[arrayIndex + j];
                        array[arrayIndex + j] = storeNumber;
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int index : array) {
            System.out.print(index + "\t");
        }
        System.out.println("");
    }
}
