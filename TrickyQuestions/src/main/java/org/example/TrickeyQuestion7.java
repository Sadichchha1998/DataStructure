package org.example;

public class TrickeyQuestion7 {
    static  int i=10;

    public static void main(String[] args) {
        changeValue(i);
        System.out.println(i);
        // it will print 10
        System.out.println(changeValue(i));
        // it will print 50
    }

    public static int changeValue(int i) {
        i=50;
        return i;
    }
    //
}
