package com.pramod.ds;

/**
 * Created by pramod on 15/8/15.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void addNode(T data){
        Node<T> node = new Node<T>();
        node.setData(data);

        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            tail = node;
        }
    }

    public void addAfter(T afterElement, T element){
        Node<T> node = head;
        Node<T> additionNode = null;
//        Node<T> newNode  = new Node<T>(data, nextNode);

        while(node != null) {
            if(node.getData() == afterElement) {
                additionNode = node;
                break;
            }
            node = node.getNextNode();
        }
        if(additionNode != null) {
            Node<T> newNode = new Node<T>();
            newNode.setData(element);
            newNode.setNextNode(additionNode.getNextNode());
            additionNode.setNextNode(newNode);
            if(additionNode == tail) {
                tail = newNode;
            }
        } else {
            System.out.println("Element not found");
        }
    }

    public void deleteFront(){
        if(head == null) {
            System.out.println("LinkedList is empty");
        } else {
            head = head.getNextNode();
        }
    }

    public void deleteAfter(T afterElement){
        Node<T> node = head;
        Node<T> deletionNode = null;

        while(node != null) {
            if(node.getData() == afterElement) {
                deletionNode = node;
                break;
            }
            node = node.getNextNode();
        }
        if(deletionNode != null) {
            Node<T> nodeToBeDeleted = deletionNode.getNextNode();
            if(nodeToBeDeleted == null) {
                System.out.println("No node to be deleted");
            } else {
                deletionNode.setNextNode(nodeToBeDeleted.getNextNode());
            }
            if(nodeToBeDeleted == tail) {
                tail = node;
            }
        } else {
            System.out.println("Element not found");
        }
    }

    public void traverse(){
        Node<T> node = head;
        while(node != null) {
            System.out.println(node.getData());
            node = node.getNextNode();
        }
    }
}
