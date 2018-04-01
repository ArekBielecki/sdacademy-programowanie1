package LinkedList;
public class Node<T> {
    private Node<T> next;
    private T element;
    private int index;

    public Node(T element){
        this.element = element;
    }

    public void addNext(Node<T> e) {
        if (next == null) {
            next = e;
        }
        else{
            next.addNext(e);
        }
    }
    public boolean hasNext(){
        if(next == null){
            return false;
        }
        else{
            return true;
        }
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> e){
        if (next == null) {
            next = e;
        }
        else{
            next = e;
        }
    }



    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        if(next == null){
            return "index: " + index + ", name: " + element;
        }
        else{
            return "index: " + index + ", name: " + element + "\n" + next;
        }
    }
}
