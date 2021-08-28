package simple;

import java.util.Locale;
import java.util.stream.Stream;

public class _2NamesCAPSLOCK {
    public static void main(String[] args) {
        //Задана строка: вывести все имена длиннее 5 букв CAPSLOCK
        String names = "Hanna, Sergej, Maxim, Elena, Ksenia, Egor, Alexander";
        Stream.of(names.split(", ")).filter(name->name.length()>5).map(name->name.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);
    }
}
