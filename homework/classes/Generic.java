package classes;

public class Generic {
    public <E> void printArray(E[] data) {
        for (E item: data) {
            System.out.print("[ " + item + " ]");
        }
    }
}
