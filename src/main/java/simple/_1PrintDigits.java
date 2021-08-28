package simple;

import java.util.stream.IntStream;

public class _1PrintDigits {
    public static void main(String[] args) {
        //создать поток чисел от 1 до 10 и вывести их на экран
        IntStream.range(1,11).forEach(System.out::println);
    }
}
