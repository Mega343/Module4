package com.goit.gojavaonline.module4;


public class Figure {

 public   final double PI = 3.14;
 public static double a, b, c, r, p, result;

    Figure(double r){
        this.r = r;
    }

    Figure(double a, double b){
        this.a = a;
        this.b = b;
    }

    Figure(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static void main(String[] args){

        Figure circle = new Figure(2.0);
        Figure rectangle = new Figure(2, 3);
        Figure triangle = new Figure(1, 5, 7);
        
        Calculate calculate = new Calculate();
        result = calculate.Calc(circle);



    }


}
