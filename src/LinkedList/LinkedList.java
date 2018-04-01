package LinkedList;

public class LinkedList<T> {
    private Node<T> first;
    private int size;

    public void add(T element) {
        if (first == null) {
            first = new Node<>(element);
            size++;
        } else {
            first.addNext(new Node<>(element));
            size++;
        }
        setIndex();
    }

    public void add(T element, int index) {
        if(index >= 0 && index < size){
            Node<T> current = first;
            if (index == 0) {
                first = new Node<>(element);
                first.setNext(current);
            } else {
                for (int i = 0; i <= index; i++) {
                    if (i == index - 1) {
                        Node<T> node = new Node<>(element);
                        Node<T> next = current.getNext();
                        current.setNext(node);
                        node.setNext(next);

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
        Node<T> current = first;
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
        if(index >= 0 && index < size) {
            Node<T> current = first;
            if (index == 0) {
                first = first.getNext();
            } else {
                for (int i = 0; i < index; i++) {
                    if (i == index - 1) {
                        Node<T> prev = current;
                        Node<T> next = current.getNext().getNext();
                        prev.setNext(next);
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
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "lista:\n" + first;
    }
}
