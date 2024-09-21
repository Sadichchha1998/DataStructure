package org.example;

import static org.example.TrickeyQuestion6.fun;

public class TrickeyQuestion6 {
    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        int x= 0;
        return ++x;
    }
    // we cant make function as a static , final
}
