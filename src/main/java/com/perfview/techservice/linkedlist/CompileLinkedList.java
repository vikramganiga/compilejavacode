package com.perfview.techservice.linkedlist;

import java.util.Scanner;

/**
 * This is an to practice traversing a linked list.
 * Given a pointer to the head node of a linked list,
 * print each node's element, one per line.
 * If the head pointer is null (indicating the list is empty)
 * else , there is nothing to print.
 */

class CompileLinkedList {

    public static void main(String args[]) {
        ProcessLinkedList p_linkedList = new ProcessLinkedList();
        SampleLinkedList linkedList = null;

        // create new linkedlist
        Scanner scanner = new Scanner(System.in);
        int noOfNodes = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2029\u2028\u0085])?");

        for (int i = 0; i < noOfNodes; i++) {
            int value = scanner.nextInt();

            scanner.skip("(\n\r|[\n\r\u2029\u2028\u0085])?");
           
            linkedList=p_linkedList.addAtTail(linkedList, value);
        }

        //insert at position
        p_linkedList.insertAtPosition(linkedList, 123, 3);
        
        // print linkedlist before delete
        p_linkedList.printLinkedList(linkedList);

        //delete node position
        p_linkedList.deleteNode(linkedList, 2);

        // print linkedlist after delete
        p_linkedList.printLinkedList(linkedList);
        scanner.close();
    }
}