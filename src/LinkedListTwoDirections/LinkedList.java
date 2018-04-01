package LinkedListTwoDirections;

public class LinkedList<T> {
    private Node<T> first;
    private int size;

    public void add(T element) {
        if (first == null) {
            first = new Node(element);
            size++;
        } else {
            first.addNext(new Node(element), first);
            size++;
        }
        setIndex();
    }

    public void add(T element, int index) {
        if(index >= 0 && index < size){
            Node current = first;
            if (index == 0) {
                first = new Node(element);
                first.setNext(current);
                current.setPrev(first);
            } else {
                for (int i = 0; i <= index; i++) {
                    if (i == index) {
                        Node node = new Node(element);
                        Node prev = current.getPrev();
                        prev.setNext(node);
                        node.setPrev(prev);
                        node.setNext(current);

                    } else {
                        current = current.getNext();
                    }
                }
            }
            size++;
            setIndex();
        }
    }
    public T get(int index){
        T element = null;
        Node current = first;
            for (int i = 0; i <= index; i++) {
                if(i == current.getIndex()){
                    element = (T)current.getElement();
                }
                current = current.getNext();
            }
        return element;
    }


    public int getSize() {
        return size;
    }

    public void remove(int index) {
        if(index >= 0 && index < size){
            Node<T> current = first;
            if (index == 0) {
                first = first.getNext();
                first.setPrev(null);
            } else {
                for (int i = 0; i <= index; i++) {
                    if (i == index) {
                        Node prev = current.getPrev();
                        Node next = current.getNext();
                        prev.setNext(next);
                        next.setPrev(prev);
                    } else {
                        current = current.getNext();
                    }
                }
            }
            size--;
            setIndex();
        }
    }

    private void setIndex(){
        Node current = first;
        for (int i = 0; i < size; i++) {
            current.setIndex(i);
            current = current.getNext();
        }
    }

    public void printList(){
        System.out.println(first.toString());
    }


    @Override
    public String toString() {
        return "lista:\n";
    }
}
