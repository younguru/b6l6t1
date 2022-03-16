package ru.netology;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String text = "Hello my friend, we apologize for not contacting  you earlier, we have extremely important information for you...";
//        Чистая детерминированная функция, без side effects, с использованием лямбда выражений и stream api, реализующая функциональный интерфейс.
        Function<String, List<String>> translater =
                s -> Arrays.stream(s.split("\\W")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        for (String word : translater.apply(text)) {
            System.out.println(word);
        }
    }
}
