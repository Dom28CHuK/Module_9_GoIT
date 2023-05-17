package classes;

import java.util.Arrays;

public class MyArrayList {

    private Object[] objects;
    private int size;

    public MyArrayList() {
        this.objects = new Object[1];
        this.size = 0;
    }

    public void add(Object value) {
        if (size == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, size);
            objects = newObjects;
        }
        objects[size] = value;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            objects[i] = objects[i + 1];
        }
        objects[size - 1] = null;
        size--;
    }
    public void clear() {
        size = 0;
        for (int i = 0; i < objects.length; i++) {
            objects[i] = null;
        }
    }
    public int size() {
        System.out.println("Array size [ " + size + " ]");
        return size;
    }
    public Object get(int index) {
        System.out.println("Element by index [ " + objects[index] + " ]");
        return objects[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "objects=" + Arrays.toString(objects);
    }
}
