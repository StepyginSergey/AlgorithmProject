package lesson_3;

import java.util.Stack;
/*
1. Реализовать рассмотренные структуры данных. Стек, очередь и дек
2. Создать программу, которая переворачивает вводимые строки(Читает справа налево).
3. Создать класс для реализации дека
*/
public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        MyStack<Integer> myStack = new MyStack();

        myStack.push(3);
        myStack.push(10);
        myStack.push(6);
        myStack.push(1);
        myStack.push(5);
        myStack.push(8);
        myStack.push(11);

        System.out.println(myStack.toString());
        System.out.println(myStack.peek());

        myStack.pop();
        myStack.pop();

        System.out.println(myStack.toString());
        System.out.println(myStack.peek());

        System.out.println("========================== Queue ===============================");

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(2);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        System.out.println(queue.toString());

        System.out.println(queue.peekFront());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.toString());

        System.out.println(queue.peekFront());

        //--------------------------- Deque ----------------------------


    }
}
