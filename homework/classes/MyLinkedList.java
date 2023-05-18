package classes;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private Object value;
        private Node previous;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }

    }
    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.previous == null) {
            head = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current.next == null) {
            tail = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        size--;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
}
