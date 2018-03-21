package FirstInFirstOut;


public class Queue<T> {
    private Object[] array;
    private int indexNumber =0;

    public void push(T element) {
        if (indexNumber > 0) {
            array = extendArray(array, new Object[++indexNumber]);
            array[indexNumber - 1] = element;
        } else {
            array = new Object[++indexNumber];
            array[indexNumber - 1] = element;
        }
    }

    public T pop() {
        if(size()>0){
                T element = (T)array[0];
                array = decreaseArray(array, new Object[--indexNumber]);
                return element;
            }
            else{
            return null;
        }
        }


    public int size() {
        return array.length;
    }

    public void printStack(){
        for(Object i : array){
            System.out.print(i+",\t");
        }
        System.out.println("");
    }

    T[] extendArray(Object[] oldArray, Object[] newArray){
        System.arraycopy(oldArray, 0, newArray, 0, newArray.length -1);
        return (T[])newArray;
    }

    T[] decreaseArray(Object[] oldArray, Object[] newArray){
        System.arraycopy(oldArray, 1, newArray, 0, newArray.length);
        return (T[])newArray;
    }
}