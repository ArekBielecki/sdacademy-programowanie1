package FirstInFirstOut;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static Queue queue = new Queue();

    public static void main(String[] args) {
        testQueueStack();
    }

    private static void testQueueStack(){
        for (int i = 0; i < 10; i++) {
            queue.push(random.nextInt(100));
        }

        queue.printStack();

        do{
            queue.pop();
            queue.printStack();
            System.out.println("");
        }
        while(queue.size()>3);

        for (int i = 0; i < 10; i++) {
            queue.push(random.nextInt(100));
        }

        queue.printStack();

        do{
            queue.pop();
            queue.printStack();
            System.out.println("");
        }
        while(queue.size()>0);
    }

}
