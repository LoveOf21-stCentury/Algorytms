package lesson1;

public class Exponential {
    //      1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
//      2. Считаем, что 1 и 2 значения последовательности равны 1.
//      3. Искать будем по формуле On=On-1+On-2 что предполагает использовать
//         рекурсивного алгоритма.
    public int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public int fibWthoutRec(int n) {
        int f = 0;
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }
}
