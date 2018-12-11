package lesson_4;

public class MyLinkedQueue<E> {
    private MyLinkedList<E> queue = new MyLinkedList<>();

    public void enquue(E element) {queue.insertLast(element);}

    public E dequeue() {return queue.deleteFirst();}

    public E peek() {return queue.getFirst();}

    public int size() {return queue.size();}

    public boolean isEmpty() {return queue.isEmpty();}
}
