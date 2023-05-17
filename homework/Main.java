import classes.MyArrayList;
import classes.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("Val");
        myArrayList.add("And");
        myArrayList.add("Hom");
        System.out.println(myArrayList);


        myArrayList.get(2);
        myArrayList.size();

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("Obama");
        System.out.println(myLinkedList);
    }
}
