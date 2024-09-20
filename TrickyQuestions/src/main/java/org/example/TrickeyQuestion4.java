package org.example;

class  Vehical1 {
    public void drive() {
        System.out.println("Driving vehicl");
    }
}
class Car1 extends  Vehical1{
    public  void drive (){
        System.out.println("Car is drivng");
        }
        public void playMusic(){
            System.out.println("playing music in the car");
        }

        }

public class TrickeyQuestion4 {
    public static void main(String[] args) {

        Vehical1 v= new Car1();
        v.drive();
       // v.playMusic();

        //using parent class we cannot able to access the child class method

    }
}
