import java.util.ArrayList;

public class MyArrayListAbhi {

    public static void main(String[] args) {
        int n = 5;

//       ArrayList type Integer
        ArrayList<Integer> myintarr = new ArrayList<Integer>(n);

//      ArrayList:: add() method appends element.
        for (int i = 0; i < n; i++)
            myintarr.add(i + 1);

        System.out.println("size of array: " + myintarr.size());

        myintarr.add(123);
        System.out.println("size of array: " + myintarr.size());
        myintarr.add(223);
        System.out.println("size of array: " + myintarr.size());

        System.out.println(myintarr);
//      remove element from at a particular index.
        myintarr.remove(2);
        System.out.println(myintarr);
        myintarr.remove(2);
        System.out.println("\n");
        System.out.println(myintarr);

//      Get index of an element get()
        System.out.println("Element at " + 2 + " is " + myintarr.get(2));
    }
};

