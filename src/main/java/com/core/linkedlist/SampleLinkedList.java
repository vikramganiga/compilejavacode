package com.core.linkedlist;

public class SampleLinkedList {

    private int data;
    private SampleLinkedList nextNode;

    public SampleLinkedList(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SampleLinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(SampleLinkedList nextNode) {
        this.nextNode = nextNode;
    }  
}
