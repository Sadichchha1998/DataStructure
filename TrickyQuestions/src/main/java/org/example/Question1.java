package org.example;

public class Question1 {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
    public int sum(int a, int b) {
        return a+b;
    }
    //it give us error because of here we are using we method with same name as a sum and same type and same number of the parameter is not allowd in the java
    // here the program is not compiled it give us an compile time error.
    public  static  void main(String[] args){}
    Question1 q1= new Question1();
    q1.sum(10,20);
    System.out.println(10,20);
}
