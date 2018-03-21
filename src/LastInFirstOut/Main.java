package LastInFirstOut;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static Stack stack = new Stack();
    private static ArrayStack arrayStack = new ArrayStack();

    public static void main(String[] args) {
        //testListStack();
        testArrayStack();


    }
    private static void testListStack(){
        for (int i = 0; i < 10; i++) {
            stack.push(random.nextInt(100));
        }

        stack.printStack();

        do{
            stack.pop();
            stack.printStack();
            System.out.println("");
        }
        while(stack.size()>3);

        for (int i = 0; i < 10; i++) {
            stack.push(random.nextInt(100));
        }

        stack.printStack();

        do{
            stack.pop();
            stack.printStack();
            System.out.println("");
        }
        while(stack.size()>3);
    }

    private static void testArrayStack(){
        for (int i = 0; i < 10; i++) {
            arrayStack.push("asd");
            arrayStack.printStack();
        }

        arrayStack.printStack();

        do{
            arrayStack.pop();
            arrayStack.printStack();
            System.out.println("");
        }
        while(arrayStack.size()>3);

        for (int i = 0; i < 10; i++) {
            arrayStack.push(random.nextInt(100));
        }

        arrayStack.printStack();

        do{
            arrayStack.pop();
            arrayStack.printStack();
            System.out.println("");
        }
        while(arrayStack.size()>0);
    }
}
