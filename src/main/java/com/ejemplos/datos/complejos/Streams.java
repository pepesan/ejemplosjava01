package com.ejemplos.datos.complejos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Streams
{
    public static void main( String[] args )
    {
        System.out.println( "Ejemplos de Streams!" );
        // takeWhile
        System.out.println("takeWhile");
        String[] fruits = {"apple", "banana", "orange", "mango", "peach"};
        Stream<String> stream = Arrays.stream(fruits).takeWhile(s -> !"orange".equals(s));
        stream.forEach(System.out::println);
        // dropWhile
        System.out.println("dropWhile");
        stream = Arrays.stream(fruits).dropWhile(s -> !"orange".equals(s));
        stream.forEach(System.out::println);
        // iterate
        System.out.println("iterate");
        Stream<String> iterate = Stream.iterate("-", s -> s.length() < 5, s -> s + "-");
        iterate.forEach(System.out::println);
        // ofNullable
        System.out.println("ofNullable con dato");
        String nullableItem = "peach";
        stream = Stream.of("apple", "banana", "orange");
        Stream<String> stream2 = Stream.concat(stream, Stream.ofNullable(nullableItem));
        stream2.forEach(System.out::println);
        // o en el caso de que sea null
        System.out.println("ofNullable con null");
        nullableItem = null;
        stream = Stream.of("apple", "banana", "orange");
        stream2 = Stream.concat(stream, Stream.ofNullable(nullableItem));
        stream2.forEach(System.out::println);
        // IntStream, LongStream, DoubleStream
        System.out.println("IntStream");
        IntStream.of(2, 4, 6, 8, 9, 10, 11)
                .takeWhile(i -> i % 2 == 0)
                .forEach(System.out::println);
        // Clase Collectors
        // filtering
        System.out.println("filtering");
        List<Integer> list = IntStream.of(2, 4, 6, 8, 10, 12)
                .boxed()
                .collect(Collectors.filtering(i -> i % 4 == 0,
                        Collectors.toList()));
        System.out.println(list);
        // flatMapping
        System.out.println("flatMapping");
        list = Stream.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8))
                .collect(Collectors.flatMapping(
                        l -> l.stream()
                                .filter(i -> i % 2 == 0),
                        Collectors.toList()
                ));
        System.out.println(list);
        // otro ejemplo de flatMapping
        Map<Integer, List<Integer>> map =
                Stream.of(List.of(1, 2, 3, 4, 5, 6),
                                List.of(7, 8, 9, 10))
                        .collect(
                                Collectors.groupingBy(Collection::size,
                                        Collectors.flatMapping(
                                                l -> l.stream()
                                                        .filter(i -> i % 2 == 0),
                                                Collectors.toList()
                                        )));
        System.out.println(map);
        // nuevos métodos para Java 10
        // toUnmodifiableList
        list = IntStream.range(1, 5)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        System.out.println(list.getClass().getName());
    }
}
