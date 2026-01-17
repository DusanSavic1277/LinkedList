package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        //Singly Linked List
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        sll.printList(); //10 -> 20 -> 30 -> null

        //Doubly Linked List
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addFirst(100);
        dll.addLast(200);
        dll.printList(); //100 <-> 200 <-> null

        //Stack
        MyStack<String> stack = new MyStack<>();
        stack.push("Java");
        stack.push("Python");
        stack.printStack(); //Python -> Java -> null

        //Queue
        MyQueue<String> queue = new MyQueue<>();
        queue.offer("A");
        queue.offer("B");
        queue.printQueue(); //A <-> B <-> null

    }

}