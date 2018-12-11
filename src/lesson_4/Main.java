package lesson_4;

public class Main {

    /*
        1. Реализовать все классы, что проходили на уроке
     */

    public static void main(String[] args) {
        System.out.println("========================== Stack ================================");
        MyLinkedStack<Integer> stack =  new MyLinkedStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        String s = "";

        while (!stack.isEmpty()) {
            s += stack.pop() + " ";
        }

        System.out.println(s);

        System.out.println("========================== Queue ================================");
        MyLinkedQueue<Integer> q = new MyLinkedQueue<>();

        q.enquue(1);
        q.enquue(2);
        q.enquue(3);
        q.enquue(4);
        q.enquue(5);
        q.enquue(6);
        q.enquue(7);

        String s1 = "";
        while (!q.isEmpty()){
            s1 += q.dequeue() + " ";
        }

        System.out.println(s1);

        System.out.println("========================== LinkedList ================================");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        for (Integer current : list) {
            System.out.print(current + " ");
        }
        System.out.println("");
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(7);

        for (Integer current : list) {
            System.out.print(current + " ");
        }

        list.insert(3, 0);

        System.out.println("");
        for (Integer current : list) {
            System.out.print(current + " ");
        }

        list.delete(9);

        System.out.println("");
        for (Integer current : list) {
            System.out.print(current + " ");
        }
        System.out.println("");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.get(3));

        list.set(2, 10);

        System.out.println("");
        for (Integer current : list) {
            System.out.print(current + " ");
        }
    }
}
