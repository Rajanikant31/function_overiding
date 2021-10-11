package com.company;
class Vehicle
{
    void run()
    {
        System.out.println("vehicle is running ");
    }
}
class bike extends Vehicle
{
    void run()
    {
        super.run();
        System.out.println("Bike is running safely");
    }
}
public class Main {

    public static void main(String[] args) {
        bike obj = new bike();
                obj.run();
	// write your code here
    }
}
