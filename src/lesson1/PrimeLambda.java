package lesson1;

import java.util.stream.IntStream;

public class PrimeLambda {
    public static boolean isPrime(int num) {
        return IntStream.rangeClosed(2, num / 2).anyMatch(n -> num%n != 0);
    }
}
