package lesson_5;

public class Program {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        System.out.println(digitSumRec(325));
        double stop = System.currentTimeMillis();
        System.out.println((stop - start) / 1000);
    }
    //n = 88365;
    //f(78365) = [8 + 8 + 3 + 6] + 5
    //[1 + 2 + 3 + 4] = f(1234)
    //f(n) = f(n / 10) + n % 10
    public static int digitSumRec(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return digitSumRec(n / 10) + n % 10;
        }
    }

    //Р”Р°РЅРѕ РЅР°С‚СѓСЂР°Р»СЊРЅРѕРµ С‡РёСЃР»Рѕ n. РќР°Р№С‚Рё СЃСѓРјРјСѓ С†РёС„СЂ С‡РёСЃР»Р° n;
    // n % 10 - РїРѕСЃР»РµРґРЅСЏСЏ С†РёС„СЂР°
    // n / 10 - С‡РёСЃР»Рѕ n Р±РµР· РїРѕСЃР»РµРґРЅРµР№ С†РёС„СЂС‹
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    //a, b: a * b = [a + a + ... + a] + a = a * (b - 1) + a
    //              ---------------------
    //                    b СЂР°Р·
    //f(a, b) = f(a, b - 1) + a

    public static int productRec(int a, int b) {
        if (b == 1) {
            return a;
        }
        else if (a == 0 || b == 0) {
            return 0;
        }
        else {
            return productRec(a, b - 1) + a;
        }
    }

    public static int product(int a, int b) {
        int sum = 0;
        while (b > 0) {
            sum += a;
            b--;
        }
        return sum;
    }

    //f(n) = f(n - 1) + n

    public static int triangleRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return triangleRec(n - 1) + n;
        }
    }

    public static int triangle(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return  sum;
    }

    //РќР°С…РѕР¶РґРµРЅРёРµ С„Р°РєС‚РѕСЂРёР°Р»Р° С‡РёСЃР»Р°
    //n! = [1*2*..*(n - 1)]*n = (n - 1)! * n
    //f(n) = f(n - 1) * n
    //5! = 1*2*3*4*5 = 120

    public static int factRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return factRec(n - 1) * n;
        }
    }

    public static int fact(int n) {
        int product = 1;
        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }

    //Р§РёСЃР»Р° Р¤РёР±РѕРЅР°С‡С‡Рё
    //f(0) = 0 f(1) = 1, f(2) = 1,
    // f(n) = f(n - 1) + f(n - 2)
    //a(n) = a(n - 1) + d
    //b(n) = b(n - 1) * q
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
    //f(n) / f(n - 1) = 1.618
    //Р”РёРЅР°РјРёС‡РµСЃРєРѕРµ РїСЂРѕРіСЂР°РјРјРёСЂРѕРІР°РЅРёРµ

    public static int phiboRec(int n) {
        System.out.println("f(" + n + ")");
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return phiboRec(n - 1) + phiboRec(n - 2);
        }
    }

    //Числа Фибоначи
    public static int phibo(int n) {
        int f_curr = 1, f_prev = 0, i = 1;
        while (i < n) {
            int f_next = f_curr + f_prev;
            f_prev = f_curr;
            f_curr = f_next;
            i++;
        }
        return f_curr;
    }
}
