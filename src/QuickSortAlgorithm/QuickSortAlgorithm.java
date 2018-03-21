package QuickSortAlgorithm;

import java.util.Random;

public class QuickSortAlgorithm {
    private static int[] array;
    private static Random random;

    public static void main(String[] args) {
        array = createArray(1200);
        //printArray(array);
        sortArray(array,0,array.length-1);
        //printArray(array);
    }

    private static int[] createArray(int size){
        int[] array = new int [size];
        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    private static void printArray(int[] array){
        for(int element: array){
            System.out.print(element+"\t");
        }
        System.out.println("");
    }

    private static void sortArray(int[] array, int lowerBound, int higherBound){
        int pivotIndex = higherBound;
        int checkedElementIndex = lowerBound;
        int boundaryIndex = lowerBound;

        while(checkedElementIndex < pivotIndex){
            if(!compareElements(array[checkedElementIndex],array[pivotIndex])){
                checkedElementIndex++;
            }
            else{
                swapElements(array, checkedElementIndex, boundaryIndex);
                checkedElementIndex++;
                boundaryIndex++;
            }
        }

        swapElements(array, boundaryIndex, pivotIndex);

        if(higherBound-lowerBound>0){
            if(boundaryIndex==higherBound){
                sortArray(array, lowerBound, boundaryIndex - 1);
            }
            else if(boundaryIndex == lowerBound){
                sortArray(array, lowerBound + 1, higherBound);
            }
            else{
                sortArray(array, lowerBound, boundaryIndex -1);
                sortArray(array, boundaryIndex +1, higherBound);
            }
        }
    }

    private static boolean compareElements(int checkedElementValue, int pivotValue) {
        boolean isElementValueLowerThanPivot = (checkedElementValue < pivotValue) ? true : false;
        return isElementValueLowerThanPivot;
    }

    private static void swapElements(int[] array, int firstElementIndex, int secondElementIndex){
        int storeNumber = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = storeNumber;
    }
}
