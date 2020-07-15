package ex.algo.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<List<Integer>> li = Arrays.asList(Arrays.asList(1,3), Arrays.asList(4, 5));
        li.stream().flatMap(List::stream).count();

        //фильтрует, не возращает ничего, промежуточный оператор, с
        //первоначальным листом ничего не поменялось
        list.stream().filter(it -> it>10).forEach(System.out::println);

        List<String> ll = Arrays.asList("c", "b", "a");
        //тоже ничего не делает с первоначальным листом
        ll.stream().map(String::toUpperCase).forEach(System.out::println);
        //Вернуть количество вхождений объекта «a»
        long a = ll.stream().filter("a"::equals).count();
        System.out.println(a);
        //Вернуть первый элемент коллекции или 0, если коллекция пуста
        String el = ll.stream().findFirst().orElse("0");
        System.out.println(el);
        ll.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
        //Добавить "_1" к каждому элементу первой коллекции
        ll.stream().map(it -> it.concat("_1")).forEach(System.out::println);
        //В первой коллекции убрать первый символ и вернуть массив чисел (int[])
       // ll.stream().map(it -> Integer.parseInt(it.substring(1))).forEach(System.out::println);
        //Отсортировать коллекцию строк по алфавиту
        ll.stream().sorted().forEach(System.out::println);
        //Отсортировать коллекцию строк по алфавиту в обратном порядке
        ll.stream().sorted(((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);










    }
}
