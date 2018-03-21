package LinkedList;
public class Node {
    private Node next;
    private String text;
    private int index;

    public Node(String text){
        this.text = text;
    }

    public void addNext(Node e) {
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

    public Node getNext(){
        return next;
    }
    public void setNext(Node e){
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
            return "index: " + index + ", name: " + text;
        }
        else{
            return "index: " + index + ", name: " + text + "\n" + next;
        }
    }
}
