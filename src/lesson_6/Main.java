package lesson_6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*        BSTBalance<Character, Integer> bst = new BSTBalance<>();
        bst.put('S', 1);
        bst.put('E', 2);
        bst.put('A', 3);
        bst.put('C', 4);
        bst.put('R', 5);
        bst.put('H', 6);
        bst.put('M', 7);
        bst.put('X', 8); //Дерево, которое мы исследовали на занятии. Оно - не блалансирвоанное
        bst.put('B', 9); //Еще несбалансированное
        bst.put('T', 9); //Еще несбалансированное
        bst.put('Z', 9); //Еще несбалансированное
        bst.put('U', 9); //А вот теперь сбалансирвоанное
        System.out.println(bst.isBalanced());

        System.out.println(bst.get('B'));
        System.out.println(bst.hight());
*/
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ

        int min = -100;
        int max = 100;
        int number = 0;

        Random random = new Random();
        BSTBalance<Integer, Integer> bst[] = new BSTBalance[20];
        boolean isBalance = false;
        long iter = 0;
        int numberOfBalanceTree = 0;
        while (iter < 100_000L) {
            for (int i = 0; i < bst.length; i++) {
                bst[i] = new BSTBalance<>();
                while (bst[i].hight() != 6) {
                    number = random.nextInt(max + 1 - min) + min;
                    bst[i].put(number, 0);
                }
            }

            for (int i = 0; i < bst.length; i++) {
                //System.out.println("Tree at number " + i + " has balance status is " + bst[i].isBalanced());
                if (bst[i].isBalanced()) numberOfBalanceTree++;
            }
            iter++;
        }

        System.out.println(iter);
        System.out.println(numberOfBalanceTree);

    }
}
