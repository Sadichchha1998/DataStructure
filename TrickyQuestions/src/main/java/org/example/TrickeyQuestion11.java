package org.example;

public class TrickeyQuestion11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
    //it will print value both that is divisible by 3 and 5
}
