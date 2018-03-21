package LastInFirstOut;


public class ArrayStack<T> {
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
            T element = null;
            if(size() > 0){
                    element = (T)array[--indexNumber];
                    array = decreaseArray(array, new Object[indexNumber]);
            }
            if (element == null){
                throw new NullPointerException();
            } else{
                return element;
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
        System.arraycopy(oldArray, 0, newArray, 0, newArray.length);
        return (T[])newArray;
    }
}
