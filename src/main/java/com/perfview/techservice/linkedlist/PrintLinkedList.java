package com.perfview.techservice.linkedlist;

import java.util.Scanner;

/**
 * This is an to practice traversing a linked list.
 * Given a pointer to the head node of a linked list,
 * print each node's element, one per line.
 * If the head pointer is null (indicating the list is empty)
 * else , there is nothing to print.
 */

class PrintLinkedList {

    SampleLinkedList linkedList, linkedListHead;


    public static void main(String args[]) {
        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.addNodes();
        printLinkedList.printNodes();
    }

    public void addNodes() {
 
        Scanner scanner = new Scanner(System.in);
        int listNodes = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2029\u2028\u0085])?");

        for (int i = 0; i < listNodes; i++) {
            int value = scanner.nextInt();
            scanner.skip("(\n\r|[\n\r\u2029\u2028\u0085])?");

            if(linkedList == null){
                linkedList = new SampleLinkedList(value);
                linkedListHead = linkedList;
            }
            else{
                linkedList= linkedList.add(linkedList, value);
            }
                
        }
        scanner.close();
    }

    public  void printNodes(){
            SampleLinkedList linkedList = linkedListHead;
            while (linkedList != null){
                linkedList.printNodeValue();
                linkedList = linkedList.getNode();

            }

        }

}