# CustomLinkedList-Java

This is a Java implementation of **Singly and Doubly Linked List**, with a demonstration of usage as **Stack** and **Queue**.

## Features

- SinglyLinkedList:
  - addFirst, addLast
  - removeFirst
  - printList
  - size
- DoublyLinkedList:
  - addFirst, addLast
  - removeFirst, removeLast
  - printList (double linked)
- MyStack (uses SinglyLinkedList)
- MyQueue (uses DoublyLinkedList)

## Why LinkedList?

- Quick add/delete at start and end
- Basic data structure in computing
- Stack and Queue can be implemented directly

## Usage

```java
SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
list.addFirst(1);
list.addLast(2);
list.printList();
