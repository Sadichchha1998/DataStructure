package org.example;

public class TrickeyQuestion9 {
    public static void main(String[] args) {
        System.out.println(fun1());
        // here main method is static and we to make function as a static then and only then
       // it will work;
        // It means that from static method we can able to access static variable and static method only.
    }
    public static int fun1(){
        return  20;
    }

}
