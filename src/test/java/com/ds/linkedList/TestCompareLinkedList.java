package com.ds.linkedList;

import java.util.Scanner;

import com.core.linkedlist.ProcessLinkedList;
import com.core.linkedlist.SampleLinkedList;

/**
 * This is an to practice traversing a linked list.
 * Given a pointer to the head node of a linked list,
 * print each node's element, one per line.
 * If the head pointer is null (indicating the list is empty)
 * else , there is nothing to print.
 */

class TestCompareLinkedList {

    public static void main(String args[]) {
        ProcessLinkedList p_linkedList = new ProcessLinkedList();

        SampleLinkedList linkedListA = null;
        SampleLinkedList linkedListB = null;

        Scanner scanner = new Scanner(System.in);

        // Compare two linkedList

        // create new linkedlistA
        System.out.println("Please enter linkedList A");
        int noOfNodes = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2029\u2028\u0085])?");

        for (int i = 0; i < noOfNodes; i++) {
            int value = scanner.nextInt();

            scanner.skip("(\n\r|[\n\r\u2029\u2028\u0085])?");

            linkedListA = p_linkedList.addAtTail(linkedListA, value);
        }

        // create new linkedlistA
        System.out.println("Please enter linkedList B");
        noOfNodes = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2029\u2028\u0085])?");

        for (int i = 0; i < noOfNodes; i++) {
            int value = scanner.nextInt();

            scanner.skip("(\n\r|[\n\r\u2029\u2028\u0085])?");

            linkedListB = p_linkedList.addAtTail(linkedListB, value);
        }

        boolean result = p_linkedList.compareLinkedList(linkedListA, linkedListB);
        if (result)
            System.out.println("Both the linked list is same ");
        else
            System.out.println("Both the linked list is not same ");

        // close the scanner
        scanner.close();
    }
}