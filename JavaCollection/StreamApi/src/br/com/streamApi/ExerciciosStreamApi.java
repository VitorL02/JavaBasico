package br.com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "50", "3", "1846", "89789", "4556456");
        System.out.println("Imprima todos os elementos dessa lista");
        /*
        Forma mais complexa
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */
        //Usando lambda
        System.out.println("Usando o lambda");
        numerosAleatorios.stream().forEach(number -> System.out.println(number));
        //List possui já o forEach sem  utilizar o stream
        numerosAleatorios.forEach(number -> System.out.println(number));
        System.out.println("Usando o reference method");
        //usando o reference metod
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Adicione os 3 primeiros elementos da lista e adicione em um set");
        numerosAleatorios.stream().limit(3).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme a lista de String em uma lista de numeros inteiros");
        List<Integer> numerosAleatoriosIntegers =
                numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Usando lambda");
        List<Integer> numerosAleatoriosIntegersLambda =
                numerosAleatorios.stream().map(integerNumbers -> Integer.parseInt(integerNumbers)).collect(Collectors.toList());
        numerosAleatorios.forEach(number -> System.out.println(number));

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque uma lista");
        //Maneira mais complexa
//        List<Integer> listParesMaioresQueDois = numerosAleatorios.stream().map(integerNumbers -> Integer.parseInt
//        (integerNumbers)).filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        if(integer % 2 == 0 && integer > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(listParesMaioresQueDois);
        //Usando lambda
        List<Integer> listParesMaioresQueDois =
                numerosAleatorios.stream().map(integerNumbers -> Integer.parseInt(integerNumbers))
                        .filter(integer -> integer % 2 == 0 && integer > 2).collect(Collectors.toList());
        System.out.println(listParesMaioresQueDois);


        System.out.println("Mostre a media dos numeros");
        numerosAleatorios.stream().mapToInt(value -> Integer.parseInt(value)).average()
                .ifPresent(value -> System.out.println(value));

        System.out.println("Remova os valores impares");
        numerosAleatoriosIntegersLambda.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosIntegersLambda);

    }


}
