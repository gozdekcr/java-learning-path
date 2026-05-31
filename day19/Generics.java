package day19;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);

        for(Integer obj: a) {
            System.out.println(obj);
        }

        Test<Integer> i = new Test<>(15);
        System.out.println(i.getObj());

        Test<String> s = new Test<>("gözde");
        System.out.println(s.getObj());

        Test2<Integer,String> t = new Test2<>(7, "gözde");
        t.print();

        Integer[] intArr = {1,2,3,4};
        Double[] doubleArr = {1.1,2.2,3.3,4.4};
        Character[] charArr = {'g' , 'ö'};

        genericMethod(intArr);
        genericMethod(doubleArr);
        genericMethod(charArr);
    }

    public static <E> void genericMethod(E[] arr) {
        for(E item: arr) {
            System.out.println(item);
        }
    }
}
