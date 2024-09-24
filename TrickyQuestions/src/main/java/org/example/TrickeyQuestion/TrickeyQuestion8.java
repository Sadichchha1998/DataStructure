package org.example.TrickeyQuestion;

public class TrickeyQuestion8 {
    public static void main(String[] args) {
        String str1= "Hello", str2= "Java";
        int i= 10, j=20;


        // This adds two integers, 10 and 20. The result will be 30.
        System.out.println(i + j);  // Output: 30


        // Since "i + j" is a string literal, it is printed as it is.
        System.out.println("i+j");  // Output: i+j


        // Here, str1 ("Hello") is concatenated with the integer i (10). The integer 10 is implicitly converted to a string.
        System.out.println(str1 + i);  // Output: Hello10


        // Java evaluates from left to right. First, "Hello" is concatenated with i (10), resulting in "Hello10".
        // Then, "Hello10" is concatenated with j (20), resulting in "Hello1020".
        System.out.println(str1 + i + j);  // Output: Hello1020


        // First, i (10) and j (20) are added together to get 30.
        // Then, the result (30) is concatenated with str1 ("Hello"), producing "30Hello".
        System.out.println(i + j + str1);  // Output: 30Hello


        // The multiplication is evaluated first (10 * 20 = 200).
        // Then, str1 ("Hello") is concatenated with 200, resulting in "Hello200".
        System.out.println(str1 + i * j);  // Output: Hello200


        // The operation is evaluated from left to right. First, "Hello" is concatenated with i (10) to produce "Hello10".
        // Then "Hello10" is concatenated with j (20) to produce "Hello1020".
        // Finally, "Hello1020" is concatenated with str2 ("Java"), resulting in "Hello1020Java".
        System.out.println(str1 + i + j + str2);  // Output: Hello1020Java
    }
}
