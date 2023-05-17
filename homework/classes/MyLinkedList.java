package classes;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    private static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
