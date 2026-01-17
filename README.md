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
  - printList (dvostruko povezano)
- MyStack (koristi SinglyLinkedList)
- MyQueue (koristi DoublyLinkedList)

## Why LinkedList?
- Brzo dodavanje/brisanje na početku i kraju
- Osnovna struktura podataka u računarstvu
- Stack i Queue mogu se implementirati direktno

## Usage

```java
SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
list.addFirst(1);
list.addLast(2);
list.printList();
