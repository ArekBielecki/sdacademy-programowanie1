package LinekListTwoDirections;

public class LinkedList {
    private Node first;
    private int size;

    public void add(Node node) {
        if (first == null) {
            first = node;
            size++;
        } else {
            first.addNext(node);
            size++;
        }
        setIndex();
    }

    public void add(Node node, int index) {
        try{
            Node current = first;
            if (index == 0) {
                first = node;
                first.setNext(current);
            } else {
                for (int i = 0; i <= index; i++) {
                    if (i == index - 1) {
                        Node next = current.getNext();
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
        catch(NullPointerException e){
        }
    }
    public String get(int index){
        String text = "";
        Node current = first;
            for (int i = 0; i <= index; i++) {
                if(i == current.getIndex()){
                    text = current.getText();
                }
                current = current.getNext();
            }
        return text;
    }


    public int getSize() {
        return size;
    }

    public void remove(int index) {
        try{
            Node current = first;
            if (index == 0) {
                first = first.getNext();
            } else {
                for (int i = 0; i < index; i++) {
                    if (i == index - 1) {
                        Node prev = current;
                        Node next = current.getNext().getNext();
                        prev.setNext(next);
                    } else {
                        current = current.getNext();
                    }
                }
            }
            size--;
            setIndex();
        }
        catch (NullPointerException e){
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
