package com.bridgelabs;

import java.util.Scanner;

public class IntegerLinkedList {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.addElement(55);
        list.addElement(52);
        list.addElement(56663);
        list.addElement(526);
        list.printList();
        System.out.println("Enter the number to add in linkedList");
        int inputUser = scanner.nextInt();
        list.addElement(inputUser);
        list.printList();
        System.out.println("Sort the linked List");
        list.sortList();
        list.printList();

    }

    MyNode head;

    public void addElement(int key) {
        MyNode myNode = new MyNode(key);
        if (head == null) {
            head = myNode;
        } else {
            myNode.next = head;
            head = myNode;
        }
    }

    public void printList() {
        MyNode cureentNode = head;
        while (cureentNode != null) {
            System.out.print(cureentNode.key + " -> ");
            cureentNode = cureentNode.next;
        }
        System.out.println("NUll");
    }

    public void sortList() {
        MyNode current = head;
        MyNode second = null;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                second = current.next;

                while (second != null) {
                    if (current.key > second.key) {
                        int temp = current.key;
                        current.key = second.key;
                        second.key = temp;
                    }
                    second = second.next;
                }
                current = current.next;
            }
        }
    }
}
