package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class GroupingBy<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {

    private final static Set<Characteristics> characteristics = new HashSet<>();
    static {
        characteristics.add(Characteristics.IDENTITY_FINISH);
    }

    private final Function<? super T, ? extends K> classifier;

    public GroupingBy(Function<? super T, ? extends K> classifier) {
        this.classifier = classifier;
    }

    @Override
    public Supplier<Map<K, List<T>>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<K, List<T>>, T> accumulator() {
        return (kListMap, t) -> kListMap.compute(classifier.apply(t),
                (k, ts) -> {
                    if (ts==null)
                        return new ArrayList<T>(Arrays.asList(t));
                    ts.add(t);
                    return ts;
                }
        );
    }

    @Override
    public BinaryOperator<Map<K, List<T>>> combiner() {
        return (kListMap, kListMap2) -> {
            kListMap2.forEach((k, ts) -> kListMap.merge(k,ts,(ts1, ts2) -> {ts1.addAll(ts2); return ts1;}));
            return kListMap;
        };

    }

    @Override
    public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return characteristics;
    }

}
