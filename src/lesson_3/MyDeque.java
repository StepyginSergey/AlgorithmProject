package lesson_3;

public class MyDeque<E> {

    private int size;
    private Object[] deq = new Object[2];

    private int startLeft;
    private int endLeft;
    private int startRight;
    private int endRight;


    public void resize(int capacty){
    }

    public void insetLeft(E element){
    }

    public void insertRight(E element){
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
