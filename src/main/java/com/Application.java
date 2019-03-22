package com;

import com.collection.MyArrayList;
import com.collection.MyLinkedList;
import com.collection.MyStack;
import com.exception.NodeIndexOutBoundaryException;
import com.exception.StackEmptyException;

public class Application {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.show();
        list.remove(5);
        list.show();
        System.out.println(list.get(4));
        list.clear();
        list.show();
        System.out.println("--------------------");

        MyLinkedList<String> link = new MyLinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add("d");
        link.add("e");
        link.show();
        try {
            link.remove(4);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        }
        link.show();
        try {
            String s = link.get(2);
            System.out.println(s);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        }
        link.clear();
        System.out.println(link.size());
        link.show();

        System.out.println("--------------------");
        MyStack<String> steck = new MyStack<>();
        steck.push("a");
        steck.push("b");
        steck.push("c");
        steck.push("d");
        steck.push("e");
        steck.push("f");
        steck.show();
        System.out.println(steck.size());
        try {
            System.out.println(steck.peek());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        try {
            steck.pop();
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        steck.show();
        try {
            steck.remove(10);
        } catch (NodeIndexOutBoundaryException e) {
            System.out.println(e.getMessage());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        steck.clear();
        steck.show();
    }
}
