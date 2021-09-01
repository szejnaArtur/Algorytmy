package pl.arturszejna.collections.list.doubleLinkedList;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    private static class Node<E> {

        E data;
        Node<E> previous;
        Node<E> next;

        public Node(E item) {
            this.data = item;
        }

        public Node(E item, Node<E> next, Node<E> prev) {
            this.data = item;
            this.next = next;
            this.previous = prev;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E item) {
        Node<E> tmp = new Node<>(item, head, null);
        if (head != null) {
            head.previous = tmp;
        }
        head = tmp;
        if (tail == null) {
            tail = tmp;
        }
        size++;
    }

    public void addLast(E item) {
        Node<E> tmp = new Node<>(item, null, tail);
        if (tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if (head == null) {
            head = tmp;
        }
        size++;
    }

    public void iterateForward() {
        Node<E> current = head;
        if (head == null) {
            System.out.println("Doubly linked list us empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void iterateBackward() {
        Node<E> current = tail;
        if (tail == null) {
            System.out.println("Doubly linked list us empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
    }

    public void add(E item) {
        Node<E> newNode = new Node<>(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next = null;
        size++;
    }

    public void deleteFirst() {
        if (size == 0) {
            throw new NoSuchElementException("The list is empty.");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> tmp = head;
            head = tmp.next;
            head.previous = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size == 0) {
            throw new NoSuchElementException("The list is empty.");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> tmp = tail;
            tail = tmp.previous;
            tail.next = null;
        }
        size--;
    }

    public E delete(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).data;
    }

    Node<E> node(int index) {
        // assert isElementIndex(index);

        Node<E> x;
        if (index < (size >> 1)) {
            x = head;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = tail;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
        }
        return x;
    }

    private E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.data;
        final Node<E> next = x.next;
        final Node<E> prev = x.previous;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.previous = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.previous = prev;
            x.next = null;
        }

        x.data = null;
        size--;
        return element;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}
