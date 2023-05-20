import classes.MyArrayList;
import classes.MyLinkedList;
import classes.MyQueue;

public class Main {
    public static void main(String[] args) {
//        MyArrayList myArrayList = new MyArrayList();
//
//        myArrayList.add("Val");
//        myArrayList.add("And");
//        myArrayList.add("Hom");
//        System.out.println(myArrayList);
//
//
//        myArrayList.get(2);
//        myArrayList.size();

//        MyLinkedList myLinkedList = new MyLinkedList();
//
//        myLinkedList.add("Obama");
//        myLinkedList.add("Barak");
//        myLinkedList.add("Ivano");
//        myLinkedList.add("Duran");
//        myLinkedList.add("Manol");
//
//        myLinkedList.remove(4);
//
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            Object value = myLinkedList.get(i);
//            System.out.println(value);
//        }

        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
