package lesson1;

public class Main {
    public static void main(String[] args) {
        Line line = new Line();

        Cube countCubes = new Cube();
//        System.out.println(countCubes.cube(2, 6));

        Exponential fibRec = new Exponential();

        Exponential fib = new Exponential();
//        long start = System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis() - start);
//        System.out.println("with recurtion:\n" + fibRec.fib(140));
//        start = System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis() - start);
//        System.out.println("without recourtion:\n" + fib.fibWthoutRec(140));
//
        PrimeNumb prime = new PrimeNumb();
        System.out.println(prime.listPrime(15));

        PrimeLambda primeLambda = new PrimeLambda();
        System.out.println(primeLambda.isPrime(13));
    }
}