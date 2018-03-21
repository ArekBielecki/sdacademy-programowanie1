package LastInFirstOut;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> list = new ArrayList<>();

    public void push(Integer number) {
        list.add(number);
    }

    public Integer pop() {
        Integer integer = list.get(size() - 1);
        list.remove(size() -1);
        return integer;

    }

    public int size() {
        return list.size();
    }

    public void printStack(){
        list.forEach(i-> System.out.print(i+",\t"));
        System.out.println("");
    }
}
