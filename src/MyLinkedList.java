import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> myIntLinkedList = new LinkedList<Integer>();

//     add elements to linked list.
        for (int i = 0; i < 5; i++)
            myIntLinkedList.add(i * 2);

        System.out.println(myIntLinkedList + "\n");

//     insert element at a particular position "index".
        myIntLinkedList.add(1, 69);
        System.out.println(myIntLinkedList);

//        Get element at index 3
        System.out.println(myIntLinkedList.get(3));
    }
}