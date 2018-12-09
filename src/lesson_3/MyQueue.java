package lesson_3;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    private int size;
    private Object[] queue = new Object[1];

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[i];
        }
        queue = temp;
    }

    public int getSize(){
        return size;
    }


    public void enqueue(E element){
        if(size == queue.length){
            resize(2 * queue.length);
        }

        queue[size++] = element;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        E element = (E) queue[0];

        Object[] temp = new Object[size - 1];
        for(int i = 1; i < size; i++){
            temp[i-1] = queue[i];
        }
        queue = temp;
        size--;
        if(size > 0 && size == queue.length/4){
            resize(queue.length / 2);
        }

        return element;
    }

    public E peekFront(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return (E) queue[0];
    }


    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < size; i++){
            s = s + " " + queue[i];
        }
        return s;
    }
}
