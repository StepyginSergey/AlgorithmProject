package lesson_5;

public class Main {

    public static void main(String[] args) {

        System.out.println("Обычный рекурсивный метод: " + degreeRec(5, 3));
        System.out.println("Обычный рекурсивный метод: " + degreeRec(2, 4));
        System.out.println("Обычный рекурсивный метод: " + degreeRec(5, 1));
        System.out.println("Обычный рекурсивный метод: " + degree(5, 3));
        System.out.println("Обычный рекурсивный метод: " + degree(2, 4));
        System.out.println("Обычный рекурсивный метод: " + degree(5, 1));
        System.out.println("Цеклический метод быстрого возведения в степень: " + degreeFast(5, 3));
        System.out.println("Цеклический метод быстрого возведения в степень: " + degreeFast(2, 4));
        System.out.println("Рекурсивный метод быстрого возведения в степень: " + degreeRecFast(5, 3));
        System.out.println("Рекурсивный метод быстрого возведения в степень: " + degreeRecFast(2, 4));
    }

    //Метод рекурсивного возведения числа в степень обычный
    private static long degreeRec(long number, int degree){
        if(number == 1){
            return 1;
        }else if(number == 0){
            return 0;
        }

        if(degree == 1){
            return number * 1;
        }else if(degree == 0){
            return 1;
        }
        else{
            return  degreeRec(number, degree - 1 ) * number;
        }
    }

    //Циклический метод возведения в степень
    private static long degree(long number, int degree){
        long result = number;
        if(degree == 0){
            return 1;
        }else if(number == 0){
            return 0;
        }

        while(degree > 1){
            result *= number;
            degree--;
        }
        return result;
    }

    //Метод циклического возведения в степень, с учетом быстрого возведения в степень
    private static long degreeFast(long number, int degree){
        long result = 1;
        if(degree % 2 == 0){
            int iter = degree / 2;

            for(int i = 0; i < iter; i++){
                result =  result * (number * number);
            }
        }else{
            int iter = (degree - 1) / 2;

            for(int i = 0; i < iter; i++){
                result =  result * (number * number);
            }
            result *= number;
        }
        return result;
    }

    private static long degreeRecFast(long number, int degree){
        long result = 1;

        if(degree % 2 == 0){
            result = result * (number * number) * degreeRec(number, degree - 2);
        }else{
            result = result * number * (number * number) * degreeRec(number, degree - 3);
        }

        return result;
    }

}
