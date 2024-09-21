package org.example;

public class TrickeyQuestion14 {
    public static void main(String[] args) {
        String str1= "thank god its friday";
        String str2= "thank god its friday";
        String str3= new String ("thank god its friday");
        System.out.println(str1==str2);
        System.out.println((str1.equals(str3)));
    }
    /*
    In short:

1. `str1 == str2` is `true` because string literals with the same content share the same object in the String Pool.

2. `str1.equals(str3)` is `true` because `.equals()` compares string contents, not object references.

3. If we had `str1 == str3`, it would be `false` because `str3` is a new object created with `new`, separate from the String Pool.

This code demonstrates the difference between string creation methods (literals vs. `new`), string pooling, and comparison using `==` (reference equality) vs. `.equals()` (content equality).
     */
}
