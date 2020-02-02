package Defination;

import NodeClass.Node;
import STACKADT.StackInterface;

import java.util.Scanner;

public class definationStack<E> implements StackInterface<E> {
    private static Scanner sc=new Scanner(System.in);
    private Node<E> top = null;
    //private Node<E> bottom = null;
    private int size = 0;

    public void addFirst(E data, Node<E> sort) {
        if (size == 0) {
            Node<E> node = new Node<>(data, sort);
            top = node;
        } else {
            Node<E> node = new Node<>(data, sort);
            node.setNext(top);
            top = node;
        }
        size++;
    }

    public void add(E data, int size) {
        if (size < 0) {
            throw new IndexOutOfBoundsException();
        } else if (size == 0) {
            addFirst(data, null);
        } else {
            addFirst(data, top);

        }
    }

    public void remove(Node next) {
        if (size > 0) {
            top = next.getNext();
            size--;
        } else
            System.out.println("Stack unerflow");
    }
    @Override
    public void push(E data) {
        add(data, size);


    }

    @Override
    public void pop() {
//        System.out.println("how many element you u want to pop out of " + size);
//        int i=sc.nextInt();
        remove(top);

    }

    @Override
    public void peek() {
        if (top!=null) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                // fetch the data for the current node
                E data = top.getData();
                top = top.getNext();
                System.out.print(data + (i < size - 1 ? ", " : ""));

            }
            System.out.println("]");
        }   else
            System.out.println("underflow");
    }
}

