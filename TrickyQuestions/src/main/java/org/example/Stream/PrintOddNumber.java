package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintOddNumber {
    public static void main(String[] args) {
        //create an arraylist
        List<Integer> nums= Arrays.asList(2,3,5,6,7,8);
        //creating stream
        Stream<Integer> mapped = nums.stream().
                filter(n->n%2==1);
        mapped.forEach(n->System.out.println(n));
    }

}
