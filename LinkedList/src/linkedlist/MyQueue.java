package linkedlist;

public class MyQueue<T> {

    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    public void offer(T value) {
        list.addLast(value);
    }

    public T poll() {
        return list.removeFirst();
    }

    public void printQueue() {
        list.printList();
    }

}