package com.goit.gojavaonline.module4;


public class Main {



    public static void main(String[] args){

        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(6, 3, 2);

        System.out.println("Square of circle is: " + circle.square(circle));
        System.out.println("Squre is triangle is: " + triangle.square(triangle));
        System.out.println("Squre of rectangle is: " + rectangle.square(rectangle));

    }
}
