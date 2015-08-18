package com.pramod.ds;

/**
 * Created by pramod on 15/8/15.
 */
public class Node<T> {
    private T data;
    private Node<T> next;

//    public Node(T data, Node<T> next){
//        this.data = data;
//        this.next = next;
//    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return next;
    }

    public void setNextNode(Node<T> next) {
        this.next = next;
    }
}
