package Tree;

import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Tree<String> stringTree = new Tree<String>();
        stringTree.addNode("Arek");
        stringTree.addNode("Marek");
        stringTree.addNode("Robert");
        stringTree.addNode("Paweł");
        stringTree.addNode("Ola");
        stringTree.addNode("Ania");
        stringTree.addNode("Kasia");
        stringTree.addNode("Jurek");
        stringTree.addNode("Malgorzata");
        stringTree.addNode("Rafal");
        stringTree.addNode("Agnieszka");

        System.out.println(stringTree);
        HeapSort<String> sortStrings = new HeapSort<String>();
        List<String> sortedStrings = sortStrings.sort(stringTree);
        System.out.println(sortedStrings);

        System.out.println("------------");

        Tree<Integer> integerTree = new Tree<Integer>();

        Random random = new Random();
        for (int i = 0; i < 22; i++) {
            integerTree.addNode(random.nextInt(50));
        }

        System.out.println(integerTree);
        HeapSort<Integer> sortIntegers = new HeapSort<Integer>();
        List<Integer> sortedIntegers = sortIntegers.sort(integerTree);
        System.out.println(sortedIntegers);

    }
}
