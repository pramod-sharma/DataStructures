package com.pramod.ds;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        int linkedListArray[] = {0,2,5,6,7,9,78};
        for(int i: linkedListArray) {
            linkedList.addNode(i);
        }
        linkedList.traverse();
        linkedList.addAfter(2, 10);
        linkedList.traverse();
        linkedList.deleteFront();
        linkedList.traverse();
        linkedList.deleteAfter(5);
        linkedList.traverse();
    }
}
