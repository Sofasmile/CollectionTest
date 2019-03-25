package com.collection;

public class MyArrayList<T> implements List<T> {
    private static final int DEFAULT_CATACITY = 10;
    private T[] arrays;
    private int size;

    public MyArrayList() {
        initialized();
    }

    private void initialized() {
        arrays = (T[]) new Object[DEFAULT_CATACITY];
        size = 0;
    }

    @Override
    public void add(T value) {
        if (size == arrays.length) {
            increaseSize();
        }
        arrays[size++] = value;
    }

    private void increaseSize() {
        T[] newArray = (T[]) new Object[(int) (arrays.length * 1.5)];
        System.arraycopy(arrays, 0, newArray, 0, size);
        arrays = newArray;
    }

    @Override
    public void remove(int i) {
        try {
            T[] newArray = (T[]) new Object[size - 1];
            System.arraycopy(arrays, 0, newArray, 0, i);
            System.arraycopy(arrays, i + 1, newArray, i, size - i - 1);
            size--;
            arrays = newArray;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bound!");
        }
    }

    @Override
    public void clear() {
        initialized();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int i) {
        try {
            return arrays[i];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index  is out of bound!");
            return null;
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }
}
