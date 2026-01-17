package linkedlist;

public class MyStack<T> {

    private SinglyLinkedList<T> list = new SinglyLinkedList<>();

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        return list.removeFirst();
    }

    public void printStack() {
        list.printList();
    }

}