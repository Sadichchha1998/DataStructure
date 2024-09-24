package org.example.TrickeyQuestion;

public class TrickeyQuestion12 {
    public static void main(String[] args) {
        String s1 = "stay safe";
        String s2 = "stay safe";
        boolean result = s1 == s2;
        //Boolean variable has only two possible value either true or false
        //so it doe not make any sense so in this case switch condition wont be work;
        //switch (result) {
        if (result) {
            System.out.println("I am safe");

            System.out.println(" I am not safe");
        } else if (!(result)) {
            System.out.println(" I am not safe");
        }
        System.out.println(" I am not sure");
    }
}
