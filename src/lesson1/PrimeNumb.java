package lesson1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumb {
    //    Написать алгоритм поиска простых чисел (делятся только на себя и
//    на 1) в диапазоне от 1 до N.
    private List<Integer> listPrime;

    public List<Integer> listPrime(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                result.add(i);
            }
        }
        return result;
    }
}
