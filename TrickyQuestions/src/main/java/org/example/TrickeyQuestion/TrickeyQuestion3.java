package org.example.TrickeyQuestion;
class Vehical{
    public void drive (){
        System.out.println("Vehical is driving");
    }

}
class Car extends  Vehical{
    public void drive (){
        System.out.println("car  is driving");
    }
}


public class TrickeyQuestion3 {
    public static void main(String[] args) {
       // Car c = new Vehical();

       // c.drive();
        // this line show error because we cannot access parent class object from the child class.
    }
}
