import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InsertionAlgorithm {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj wielkość listy: ");
        int size = input.nextInt();
        List<Integer> list = createList(size);
        printList(list);
        sortList(list);
        printList(list);
    }

    private static List<Integer> createList(int size){
        Random random = new Random();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    private static List<Integer> sortList (List<Integer> list){
        int storeNumber;
        int index;
        for (int i = 1; i < list.size(); i++) {
            index = i;
            try{
                while(list.get(index) < list.get(index - 1)) {
                        storeNumber = list.get(index);
                        list.set(index, list.get(index - 1));
                        list.set(index - 1, storeNumber);
                        index--;
                }
            }
            catch (IndexOutOfBoundsException e){
            }
        }
        return list;
    }

    private static void printList(List<Integer> list){
        for (int index : list) {
            System.out.print(index + "\t");
        }
        System.out.println("");
    }
}
