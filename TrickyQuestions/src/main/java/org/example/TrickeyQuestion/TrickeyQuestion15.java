package org.example.TrickeyQuestion;


public class TrickeyQuestion15 {
    public static void main(String[] args) {
Child c= (Child) new Parent1();
// here we are creating object of the parent class and store in the  refrence of child
        c.PrintMsg();
    }
}
//class org.example.Parent1 cannot be cast to class org.example.Child
// (org.example.Parent1 and org.example.Child are in unnamed module of loader 'app')
     class Parent1 {
        public void PrintMsg() {
            System.out.println("from parent class");
        }
    }
    class Child extends  Parent1{
        public void PrintMsg() {
            System.out.println("from child class");
        }
    }

