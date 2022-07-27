package com.perfview.techservice.linkedlist;

public class SampleLinkedList {

    private int data;
    private SampleLinkedList nextNode;

   
    public SampleLinkedList(int data) {
        this.data = data;
        this.nextNode = null;
    }
    
    public SampleLinkedList add(SampleLinkedList sampleLinkedList, int value){
        SampleLinkedList newList = new SampleLinkedList(value);

        sampleLinkedList.nextNode=newList;
       
        return newList;
    }

    public void printNodeValue(){
        System.out.println(" value "+ data);
    }
    
    public SampleLinkedList getNode(){
        return this.nextNode;
    }

}
