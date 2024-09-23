package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DoubleNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 5, 4, 2, 4, 7, 9);
        Stream<Integer> data = nums.stream();
        Stream<Integer> mappedData = data.map(n -> n * 2);
        mappedData.forEach(n->System.out.println(n));
    }
}
