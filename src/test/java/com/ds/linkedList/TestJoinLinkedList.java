package com.ds.linkedList;

import java.util.Scanner;

import com.core.linkedlist.ProcessLinkedList;
import com.core.linkedlist.SampleLinkedList;

/**
 * Join the two linkedList
 */

class TestJoinLinkedList {

    public static void main(String args[]) {
        ProcessLinkedList p_linkedList = new ProcessLinkedList();

        SampleLinkedList linkedListA = null;
        SampleLinkedList linkedListB = null;
        SampleLinkedList linkedListR = null;

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

        linkedListR = p_linkedList.mergeLinkedList(linkedListA, linkedListB);
       
        p_linkedList.printLinkedList(linkedListR);

        // close the scanner
        scanner.close();
    }
}