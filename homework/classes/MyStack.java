package classes;


public class MyStack {
    private Node top;
    private int size;

    private class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    private Node getNode(int index) {
        Node current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public void remove(int index) {
        if (index == 0) {
            top = top.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = prev.next.next;
        }
        size--;
    }
    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }
        return top.value;
    }
    public Object pop() {
        if (size == 0) {
            return null;
        }
        Object value = top.value;
        top = top.next;
        size--;
        return value;
    }
}
