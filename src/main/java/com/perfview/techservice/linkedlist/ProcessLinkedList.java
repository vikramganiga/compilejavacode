package com.perfview.techservice.linkedlist;

public class ProcessLinkedList {
    
    public SampleLinkedList addAtTail(SampleLinkedList head, int value){
        if(head == null){
            head = new SampleLinkedList(value);
            System.out.println("adding first node value "+head.getData());
            return head ;
        }
        else{
            SampleLinkedList prev_head = head;
            SampleLinkedList temp_head = head.getNextNode();
            while(temp_head != null){
                prev_head = temp_head;
                temp_head = temp_head.getNextNode();
            }
            prev_head.setNextNode(new SampleLinkedList(value));
            
            System.out.println("adding first node value "+prev_head.getData());
        }
        return head;
    }

    public void printLinkedList(SampleLinkedList list){
        SampleLinkedList temp_list = list;

        while(temp_list != null){
            System.out.println(temp_list.getData());
            temp_list = temp_list.getNextNode();
        }
    }
}
