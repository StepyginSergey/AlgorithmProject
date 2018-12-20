package lesson_8;

public class Main {
    // 1. Создать программу, реализующую метод цепочек.

    public static void main(String[] args) {

        LinearProbingHashTable<Integer, Integer> liner = new LinearProbingHashTable<>();
        int tmp = 1;
        liner.put(1 , tmp *= 2);
        liner.put(2 , tmp *= 2);
        liner.put(1 , tmp *= 2);
        liner.put(3 , tmp *= 2);
        liner.put(4 , tmp *= 2);


        System.out.println(liner.toString());

        System.out.println("Размер списка: " + liner.size());


        for(int i = 0; i<150; i++){
            liner.put(i , tmp += 2);
        }

        System.out.println("Размер списка: " + liner.size());
    }
}
