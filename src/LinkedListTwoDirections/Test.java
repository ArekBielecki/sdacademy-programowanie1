package LinkedListTwoDirections;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jan");
        list.add("Andrzej");
        list.add("Michał");
        list.add("Robert",0);
        list.printList();
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        list.remove(2);
        list.printList();
        list.remove(0);
        list.printList();

    }

}
