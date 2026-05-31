package day19;
import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> items = new ArrayList<T>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        int LastIndex = items.size()-1 ;
        T item = items.get(LastIndex);
        items.remove(LastIndex);
        return item;
    }

    public T peak() {
        int lastIndex = items.size() -1;
        return items.get(lastIndex);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> intArr = new Stack<>();

        intArr.push(1);
        intArr.push(2);
        intArr.push(3);
        intArr.push(4);

        System.out.println(intArr.pop());
        System.out.println(intArr.peak());
        System.out.println(intArr.isEmpty());
    

    }

    
}
