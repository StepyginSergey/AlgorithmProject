package lesson_3;

import java.util.NoSuchElementException;

public class MyStack<E> {

    private int size;
    private Object[] stack = new Object[1];

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    public int getSize(){
        return size;
    }


    public void push(E element){
        if(size == stack.length){
            resize(2 * stack.length);
        }

        stack[size++] = element;
    }

    public E pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        E element = (E) stack[size - 1];
        stack[size - 1] = null;
        size--;
        if(size > 0 && size == stack.length/4){
            resize(stack.length / 2);
        }

        return element;
    }

    public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return (E) stack[size - 1];
    }


    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < size; i++){
            s = s + " " +stack[i];
        }
        return s;
    }
}
