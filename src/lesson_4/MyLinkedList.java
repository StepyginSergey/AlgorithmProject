package lesson_4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {

    private class MyLinkedListIterator implements Iterator<E> {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E item = current.item;
            current = current.next;
            return item;
        }
    }

    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class Node {
        E item;
        Node next;
        Node previous;

        public Node(E item, Node next, Node previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

    private int size = 0;
    private Node first = null;
    private Node last = null;

    public int size() {return size;}

    public boolean isEmpty() {return size == 0;}

    public void insertFirst(E item) {
        Node oldFirst = first;
        first = new Node(item, oldFirst, null);
        if (isEmpty()) {
            last = first;
        }
        else {
            oldFirst.previous = first;
        }

        size++;
    }

    public E deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E item = first.item;
        first = first.next;
        first.previous = null;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public void insertLast(E item) {
        Node oldLast = last;
        last = new Node(item, null, oldLast);
        if (isEmpty()) {
            first = last;
        }
        else {
            oldLast.next = last;
        }
        size++;
    }

    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return last.item;
    }

    public E deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E item = last.item;
        Node previous = last.previous;
        last.previous = null;
        last = previous;
        size--;
        if (isEmpty()) {
            first = null;
        }
        else {
            last.next = null;
        }
        return item;
    }

    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node current = first;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        return current.item;
    }

    public void set(int index, E item) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node current = first;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        current.item = item;
    }

    public boolean find(E item) {
        Node current = first;
        while (current != null && !current.item.equals(item)) {
            current = current.next;
        }
        return current != null;
    }

    public E delete(E item) {
        Node current = first;

        while (current != null && !current.item.equals(item)) {
            current = current.next;
        }
        if (current == null) {
            return null;
        }
        if (current == first) {
            return deleteFirst();
        }
        else if (current == last) {
            return deleteLast();
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
        current.next = null;
        current.previous = null;
        return current.item;
    }

    public void insert(int index, E item) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            insertFirst(item);
            return;
        }
        else if (index == size) {
            insertLast(item);
            return;
        }
        int currentIndex = 0;
        Node current = first;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        Node newNode = new Node(item, current, current.previous);
        current.previous.next = newNode;
        current.previous = newNode;
        size++;
    }
}
