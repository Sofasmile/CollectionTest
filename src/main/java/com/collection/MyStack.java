package com.collection;

import com.exception.NodeIndexOutBoundaryException;
import com.exception.StackEmptyException;

public class MyStack<T> {
    private Node<T> head;
    private int size;

    public MyStack() {
        head = new Node<>(null, null);
        size = 0;
    }

    private static class Node<T> {
        public Node<T> next;
        public T data;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void push(T item) {
        Node<T> node = new Node<>(item, head);
        head = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        } else {
            Node<T> temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return head.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        int oldSize = size;
        for (int i = 0; i < oldSize; i++) {
            pop();
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        if (index >= size || index < 0) {
            throw new NodeIndexOutBoundaryException("Index is out of bound!");
        }
        if (index == 0) {
            pop();
        } else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            remove(prev);
        }
    }

    private void remove(Node<T> prev) {
        Node<T> node = prev.next;
        if (node.next == null) {
            prev.next = null;
        } else {
            prev.next = node.next;
        }
        size--;
    }

    public void show() {
        Node<T> item = head;
        for (int i = 0; i < size; i++) {
            System.out.print(item.data + " ");
            item = item.next;
        }
        System.out.println();
    }

}
