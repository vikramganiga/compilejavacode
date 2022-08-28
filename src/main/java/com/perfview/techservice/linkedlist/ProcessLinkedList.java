package com.perfview.techservice.linkedlist;

public class ProcessLinkedList {

    //delete the node
    public boolean deleteNode(SampleLinkedList head, int position){
        if(head == null ){
            return false;
        }
        else{
            SampleLinkedList prev_head = head;
            SampleLinkedList next_head = head.getNextNode();
            int i;
            for(i=position;i < position && next_head != null ; i++ ){
                prev_head = next_head;
                next_head = head.getNextNode();
            }

            if(i == position && prev_head != null){
                System.out.println("deleted node " + next_head.getData());
                prev_head.setNextNode(next_head.getNextNode());
            }
            return true;
        }
    }

    //add tail
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

            System.out.println("added node value " + prev_head.getData());
        }
        return head;
    }

    //insert at poisition
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
            System.out.println("current position "+startPosition);
        }

        if (startPosition == position && prev_head != null) {
            System.out.println("position is "+startPosition);
            temp_head = prev_head.getNextNode();
            prev_head.setNextNode(new SampleLinkedList(value));
            prev_head.getNextNode().setNextNode(temp_head);
        }
        else{
            System.out.println("position out of range "+ startPosition);
        }
        return head;
    }
    //print the linkedList
    public void printLinkedList(SampleLinkedList list) {
        SampleLinkedList temp_list = list;

        while (temp_list != null) {
            System.out.println(temp_list.getData());
            temp_list = temp_list.getNextNode();
        }
    }
}
