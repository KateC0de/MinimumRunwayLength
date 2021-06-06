/*
This program calculates the minimum runway length.
*/

import java.util.Scanner;

public class Runway{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        complete(kb);
    }

    public static void complete(Scanner kb){
        System.out.print("Enter the number of the times you want to use the software: ");
        int count = kb.nextInt();
        for(int i = 1; i <= count; i++){
            //your code
            System.out.print("Enter the speed in km/h(240-285): ");
            double speed = kb.nextDouble();

            System.out.print("Enter the value for acceleration(1-5): ");
            double acceleration = kb.nextDouble();
            double speedV = convert(speed);

            double miniLength = getLength(speedV, acceleration);

            System.out.println("The minimum runway length with");
            System.out.println("The speed of " + speed);
            System.out.println("Acceleration of " + acceleration);
            System.out.print("is ");
            System.out.printf("%.2f\n",miniLength);
            System.out.println();


        }
        // your code
        System.out.println("Good Bye!");



    }
    //this method converts kilometer/hour to meter/second. do a research to find the formula for conversion
    //meters per second = kilometers per hour × 0.277778

    public static double convert(double speed){
        speed = speed/3.6;

        return speed; // zero must be changed after you write your code

    }

    //this method gets the speed in meter/s and the acceleration and returns the length of the runway
    // length = (v*v)/(2*a)
    public static double getLength(double speed, double acceleration){
        //your code
        double length = (speed*speed) / (2*acceleration);
        return length; //zero must be changed after you write your code
    }
}