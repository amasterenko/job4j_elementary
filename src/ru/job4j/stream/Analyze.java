package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(Collectors.averagingDouble(Subject::getScore));
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(p.getName(),
                        p.getSubjects().stream()
                        .collect(Collectors.averagingDouble(Subject::getScore))))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(e -> new Tuple(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(p.getName(),
                        p.getSubjects().stream()
                                .mapToDouble(Subject::getScore)
                                .sum()))
                .max(Tuple::compareTo)
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
         return stream
                 .flatMap(p -> p.getSubjects().stream())
                 .collect(Collectors.groupingBy(
                         Subject::getName,
                         LinkedHashMap::new,
                         Collectors.summingDouble(Subject::getScore)))
                 .entrySet().stream()
                 .map(e -> new Tuple(e.getKey(), e.getValue()))
                 .max(Tuple::compareTo)
                 .orElse(null);
    }
}
