package com.ejemplos.datos.complejos;

import java.util.*;
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
        List<String> list = Arrays.asList("apple", "banana", "orange", "mango", "peach");

        // código de filtrado
        List<String> listadoFiltrado = new ArrayList<>();
        for (String s : list) {
            if (!s.equals("apple")) {
                listadoFiltrado.add(s);
            }
        }
        // imprimir los elementos por pantalla
        for (String s : listadoFiltrado) {
            System.out.println(s);
        }



        System.out.println("listado original");
        System.out.println(list);

        // foreach
        // coge el listado
        list
            // ejecuta mediante un foreach una función
            .forEach(
                    // imprime cada dato por pantalla
                    System.out::println // (s)
                    /*
                        // método tradicional
                        public void imprime(String s){
                            System.out.println(s);
                        }
                        // método lambda (array function ->)
                        // no hay nombre de función realmente
                        (String s) -> {
                            System.out.println(s);
                        }
                        // como sabemos  que el dato guardado en el stream es de tipo String
                        s -> {System.out.println(s);}
                        // como la función sólo tiene una línea podemos quitar las {} y el ;
                        s -> System.out.println(s)
                        // como sólo pasamos un único parámetro a la función
                        // y la llamada a la función println recibe un sólo parámetro
                        // no hace falta si declarar el argumento
                        // ni pasarlo a la función println
                        System.out::println
                     */
            );


        // filter
        System.out.println("listado filtrado");
        list
            // conversión a un Stream
            .stream() // Stream<String>
            // filtrado de datos dentro del stream
            // List<String> list = Arrays.asList("apple", "banana", "orange", "mango", "peach");
            .filter(
                // función lambda
                // public Boolean funcionFiltrado(String cadena) -> {
                //      return true o false
                // }
                // arrow function
                // (parametros) -> { bloque de código de la función }
                // (String cadena)  -> {return !cadena.equals("apple")}
                (cadena) -> !cadena.equals("apple")
                // en Scala se escribe así parecido
                // (_) -> !_.equals("apple")
                // _ -> !_.equals("apple")
                // !_.equals("apple")
                // devolverá true -> deja elemento del listado en el resultado
                // devolverá false -> NO deja elemento del listado en el resultado
            )
            // imprimir los datos por pantalla
            //forEach
            .forEach(
                    /*
                    (s) -> {
                        System.out.println(s);
                    }
                     */
                    System.out::println
            );

        // código sin comentarios
        list
            .stream()
            .filter(s -> !s.equals("apple"))
            .forEach(System.out::println);

        // toList
        System.out.println("toList");
        List<String> otroListado = list
            .stream()
            .filter(s -> !s.equals("apple"))
            // puede tener menos elementos que el stream original
           // casting al tipo original
           .toList();
        System.out.println(otroListado);


        list
                .stream()
                // transformar objeto a objeto
                .map(
                    /*
                    public String funcionTransformadora(String s) {
                        return s+ "modificación";
                    }
                    (String s) -> {return s+"modificacion";}
                    (s) -> {return s+"modificacion";}
                    s -> {return s+"modificacion";}
                    s -> s+"modificacion"
                    */
                        s -> s+"!"
                )
                // stream de datos del mismo número de elementos que el stream original
                .forEach(System.out::println);

        // map que devuelve otra cosa
        System.out.println("listado mapeado que devuelve otro tipo de dato");
        list
                .stream()
                // transformar objeto a objeto
                .map(
                        String::length
                        // public Integer dameLength(String s){
                        //   return s.lenght();
                        // }
                        // (String s) -> {return s.length();}
                        // (s) -> {return s.length();}
                        // s -> {return s.length();}
                        // s -> s.length()

                )
                // stream de datos del mismo número de elementos que el stream original
                .forEach(System.out::println);

        // reduce
        System.out.println("reduce");
        System.out.println("listado original");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        // forma antigua
        Integer sumaTodosLosNumeros  = 0;
        for (Integer i : numeros) {
            sumaTodosLosNumeros+= i;
        }
        System.out.println(sumaTodosLosNumeros);

        sumaTodosLosNumeros = numeros
                .stream()
                .reduce(// valor inicial de acc
                        0,
                        // función que maneja en el foreach
                        // acc = valor que vamos pasando de llamada en llamada
                        // current = valor actual del elemento visitado en cada iteración del foreach
                        // valor devuelto es la suma de los dos valores
                        (acc, current) -> acc+=current
                        /*
                            public void sumaAcumulada(Integer acc, Integer current){
                                acc+=current;
                            }
                            (Integer acc, Integer current) -> {return acc+=current;}
                            (acc, current) -> {return acc+=current;}
                            (acc, current) -> acc+=current
                         */
                );
        // el valor acumulado se almacena en sumaTodosLosNumeros
        System.out.println("suma de valores: "+ sumaTodosLosNumeros);


        Integer multiplicaTodosLosNumeros = numeros
                .stream()
                .reduce(// valor inicial de acc
                        1,
                        // función que maneja en el foreach
                        // acc = valor que vamos pasando de llamada en llamada
                        // current = valor actual del elemento visitado en cada iteración del foreach
                        // valor devuelto es la multiplicación de los dos valores
                        (acc, current) -> acc*=current);
        // el valor acumulado se almacena en sumaTodosLosNumeros
        System.out.println("multiplicación de valores: "+ multiplicaTodosLosNumeros);

        // Count, Sum, Min, Max
        // COUNT
        long count =
                List.of(1L, 2L, 3L)
                        .stream()
                        .reduce(0L,
                                (acc, cur) -> acc + 1
                        );
        // SUM
        Long sum =
                List.of(1L, 2L, 3L)
                        .stream()
                        .reduce(0L,
                                (acc, cur) -> acc + cur);
        // MIN
        Long min =
                List.of(10L, 5L, 11L)
                        .stream()
                        .reduce(Long.MAX_VALUE,
                                (acc, cur) -> acc.compareTo(cur) < 0 ? acc : cur);
        // MAX
        Long max =
                List.of(10L, 5L, 11L)
                        .stream()
                        .reduce(Long.MIN_VALUE,
                                (acc, cur) -> acc.compareTo(cur) > 0 ? acc : cur);


        // flatmap
        System.out.println("flatmap");
        System.out.println("listado de listados");
        // list of even numbers
        List<Integer> even = Arrays.asList( 2, 4, 6, 8, 10);
        // list of odd numbers
        List<Integer> odd = Arrays.asList( 3, 5, 7, 9, 11);
        // list of prime numbers
        List<Integer> primes = Arrays.asList(17, 19, 23, 29, 31);
        // list of numbers
        List<List<Integer>> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(even);
        listOfNumbers.add(odd);
        listOfNumbers.add(primes);
        System.out.println("listado de listados original");
        List<Integer> flattenedList = listOfNumbers
                .stream()
                .flatMap(
                        Collection::stream
                        /*
                        public Stream<Integer> devuelveInteger (List<Integer> listado){
                            return listado.stream();
                        }
                        (List<Integer> listado) -> {return listado.stream();}
                        (listado) -> {return listado.stream();}
                        (listado) -> listado.stream()
                        Collection::stream
                         */
                )
                .toList();

        System.out.println("list of numbers (flattend) : " + flattenedList);

        // Java 9-11
        // takeWhile
        System.out.println("takeWhile");
        String[] fruits = new String[]{"apple", "banana", "orange", "mango", "peach"};
        Stream<String> stream = Arrays.stream(fruits).takeWhile(s -> !"orange".equals(s));
        stream.forEach(System.out::println);

        // dropWhile
        System.out.println("dropWhile");
        stream = Arrays.stream(fruits).dropWhile(s -> !"orange".equals(s));
        stream.forEach(System.out::println);


        // iterate
        System.out.println("iterate");
        Stream<String> iterate = Stream.iterate(
                // semilla
                "-",
                // condición de while
                s -> s.length() < 5,
                // dato a generar
                s -> s + "-");
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
        /*
            List<Integer> listado = List.of(2, 4, 6, 8, 9, 10, 11);
            listado.stream();
         */
        IntStream.of(2, 4, 6, 8, 9, 10, 11)
                .takeWhile(i -> i % 2 == 0)
                .forEach(System.out::println);
        // Clase Collectors
        // filtering
        System.out.println("filtering");
        List<Integer> list2 = IntStream.of(2, 4, 6, 8, 10, 12)
                .boxed()
                .collect(Collectors.filtering(i -> i % 4 == 0,
                        Collectors.toList()));
        System.out.println(list);
        // flatMapping
        System.out.println("flatMapping");
        list2 = Stream.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8))
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
        list2 = IntStream.range(1, 5)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);
        System.out.println(list.getClass().getName());
    }
}
