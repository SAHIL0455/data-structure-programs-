package com.bridgelabs;

import java.util.LinkedList;
import java.util.Scanner;

public class StringLinkList {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("dhawan");
        list.addFirst("rohit");
        list.addFirst("ishan");
        list.addFirst("virat");
        list.addFirst("chahal");
        System.out.println(list);

        // searching the element in linked list
        System.out.println("Enter the String is search in linked list");
        String name = scanner.next();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (name == list.get(i)) {
                System.out.println("String is Found in linked list ");
                System.out.println("Now delete this string in linked list");
                list.remove(i);
                System.out.println(list);
            } else {
                System.out.println("String is not Found in linked list ");
                System.out.println("Now add this string in linked list");
                list.addFirst(name);
                System.out.println(list);
            }
        }
    }
}
