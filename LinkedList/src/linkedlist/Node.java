package linkedlist;

public class Node<T> {

    T data;
    Node<T> next;
    Node<T> prev; //Koristi se samo za DoublyLinkedList

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}