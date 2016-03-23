package com.goit.gojavaonline.module4;


public class Main {



    public static void main(String[] args){

        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2, 3, 2);

        circle.square(circle);
        triangle.square(triangle);
        rectangle.square(rectangle);


    }


}
