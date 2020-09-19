package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> iterator) {
        return getStream(iterator)
                .flatMap(FlatIt::getStream)
                .collect(Collectors.toList());
    }

    private static <T> Stream<T> getStream(Iterator<T> iterator) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(iterator, 0),
                false);
    }
}
