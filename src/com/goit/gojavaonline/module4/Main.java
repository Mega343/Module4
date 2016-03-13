package com.goit.gojavaonline.module4;


public class Main {



    public static void main(String[] args){

        Figure circle = new Figure(2.0);
        Figure rectangle = new Figure(2, 3);
        Figure triangle = new Figure(1, 5, 7);

        Calculate calculate = new Calculate();
        calculate.calcCircle(circle);
        calculate.calcRectangle(rectangle);
        calculate.calcTriangle(triangle);


    }


}
