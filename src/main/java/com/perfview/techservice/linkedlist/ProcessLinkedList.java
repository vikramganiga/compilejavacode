package com.perfview.techservice.linkedlist;

import java.util.ArrayList;

public class ProcessLinkedList {

    // Reverse the LinkedList

    public SampleLinkedList reverse(SampleLinkedList head) {
        System.out.println(" reverse the linkedList");
        SampleLinkedList reverseHead = null;
        SampleLinkedList reverseStart = null;
        SampleLinkedList tempNode;
        ArrayList<Integer> data = new ArrayList<Integer>();

        // get the data first
        while (head != null) {
            data.add(head.getData());
            head = head.getNextNode();
        }

        for (; data.size() != 0;) {
            Integer temp_data = data.remove(data.size() - 1);
            if (reverseHead == null){
                reverseHead = new SampleLinkedList(temp_data);
                reverseStart = reverseHead;
            }
            else {
                tempNode = new SampleLinkedList(temp_data);
                reverseHead.setNextNode(tempNode);
                reverseHead = tempNode;
            }

        }
        return reverseStart;
    }

    // delete the node
    public boolean deleteNode(SampleLinkedList head, int position) {
        if (head == null) {
            return false;
        } else {
            SampleLinkedList prev_head = head;
            SampleLinkedList next_head = head.getNextNode();
            int i;
            for (i = position; i < position && next_head != null; i++) {
                prev_head = next_head;
                next_head = head.getNextNode();
            }

            if (i == position && prev_head != null) {
                System.out.println("deleted node " + next_head.getData());
                prev_head.setNextNode(next_head.getNextNode());
            }
            return true;
        }
    }

    // add tail
    public SampleLinkedList addAtTail(SampleLinkedList head, int value) {
        if (head == null) {
            head = new SampleLinkedList(value);
            System.out.println("adding first node value " + head.getData());
            return head;
        } else {
            SampleLinkedList prev_head = head;
            SampleLinkedList temp_head = head.getNextNode();
            while (temp_head != null) {
                prev_head = temp_head;
                temp_head = temp_head.getNextNode();
            }
            prev_head.setNextNode(new SampleLinkedList(value));

            System.out.println("added node value " + prev_head.getNextNode().getData());
        }
        return head;
    }

    // insert at poisition
    public SampleLinkedList insertAtPosition(SampleLinkedList head, int value, int position) {

        if (head == null && position == 1) {
            head = new SampleLinkedList(value);
            return head;
        }
        // travel
        SampleLinkedList prev_head = head;
        SampleLinkedList temp_head = head.getNextNode();
        int startPosition = 2;
        while (temp_head != null && startPosition < position) {
            prev_head = temp_head;
            temp_head = temp_head.getNextNode();
            startPosition++;
            System.out.println("current position " + startPosition);
        }

        if (startPosition == position && prev_head != null) {
            System.out.println("position is " + startPosition);
            temp_head = prev_head.getNextNode();
            prev_head.setNextNode(new SampleLinkedList(value));
            prev_head.getNextNode().setNextNode(temp_head);
        } else {
            System.out.println("position out of range " + startPosition);
        }
        return head;
    }

    // print the linkedList
    public void printLinkedList(SampleLinkedList list) {
        SampleLinkedList temp_list = list;
        System.out.println("printinng the linkedlist ");
        while (temp_list != null) {
            System.out.println(temp_list.getData());
            temp_list = temp_list.getNextNode();
        }
    }
}
