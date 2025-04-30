package ud6.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamClass <T> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dado");
        list.add("arte");
        list.add("bola");
        list.add("asa");
        list.add("buzo");

        Stream<String> streamCad = list.stream();

        Predicate<String> empiezaPorA = s-> s.startsWith("a");

        Stream <String> streamA = streamCad.filter(empiezaPorA);
        //Stream <String> streamA2 = streamCad.filter(s-> s.startsWith("a"));


        System.out.println(streamA);
        Consumer<String> mostrar = s -> System.out.println(s);
        streamA.forEach(mostrar);

        streamA.forEach(System.out::println);

    }
}
