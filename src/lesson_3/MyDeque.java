package lesson_3;

public class MyDeque<E> {

    private int size;
    private Object[] deq = new Object[10];

    private int startLeft;
    private int endLeft;
    private int startRight;
    private int endRight;

    public MyDeque(){
        startLeft = size;
        endLeft = size;
        startRight = deq.length;
        endRight = deq.length;
    }

    public int getSize(){
        return size;
    }

    public void resize(int capacity){
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = deq[i];
        }
        deq = temp;
    }

    public void insetLeft(E element){
        //if(){}
        deq[size++] = element;
        endLeft = size;
    }

    public void insertRight(E element){
        startRight = deq.length;
        //deq[]
    }

    public E removeLeft(){
        return null;
    }

    public E removeRight(){
        return null;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < size; i++){
            s = s + " " +  deq[i];
        }
        return s;
    }
}
