package org.example.TrickeyQuestion;

class Vehical2{
    int numSpeed=200;
    public  static void drive(){
        System.out.println("Driving vehical..");
    }
    public  void race(){
        System.out.println("Drving car at speed +"+numSpeed);
    }

}
class Car2 extends  Vehical2{

    int numSpeed=300;
    public  static void drive(){
        System.out.println("Driving car..");
    }
    public  void race(){
        System.out.println("Drving car at speed +"+numSpeed);
    }
}

public class TrickeyQuestion5 {
    public static void main(String[] args) {
        Vehical2 v= new Car2();
        v.drive();
        v.race();
        System.out.println(v.numSpeed);

    }
   // we are not able to override the static method ,private method and final method
    // v.race() we can able to is the instace method we can able to access it is child class method so numspeed is print in child class
    //we cannot able to override variable in the java.

}
/*
output
Driving vehical..
Drving car at speed +300
200
 */
