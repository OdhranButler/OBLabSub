// Author : Odhrán Butler
// Date : november 2021
// Purpose : A test driver program for our : Point/Circle inheritance
public class MyFirstCircle {
    public static void main(String[] args) {
        point point1 = new point(10, 20);
        circle circle1 = new circle(15, 30, 5);
        System.out.println("Point details : " + point1);
        System.out.println("Circle details: " + circle1);
    }
}