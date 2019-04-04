package net;

public class Main {
    private static MyNumber number = () -> 0;
    private static NumericTest numeric = value -> value == 0;
    private static TwoNumbers two = (a, b) -> a * b;
    private static BlockOne blockOne = a -> {
        a *= 10;
        a /= 22;
        return a;
    };
    private static BlockTwo blockTwo = (int a, int b) -> {
        a *= b;
        b /= 12;
        return a * Math.pow(b, 2);
    };

    public static void main(String[] args) {
        System.out.println("А вот и нолик: " + number.apply());
        System.out.println("15 равно нулю? - " + numeric.apply(15));
        System.out.println("Произведение 13 на 6 - " + two.apply(13, 6));
        System.out.println("Первое блочное лямбда выражение: " + blockOne.apply(67));
        System.out.println("Второе блочное лямбда выражение: " + blockTwo.apply(13, 88));
    }
}