package com.goit.gojavaonline.module4;


public class Calculate {

public static double Calc(double r){
    double result;
    final double PI = 3.14;
    result = PI*r*r;
    if(result <= 0){
        System.out.println("Такого круга не существует.");
        }
    else
        System.out.println("Площадь круга = " + result);
    return result;
    }

    public static double Calc(double a, double b){
        double result;
        result = a * b;
        if(result <= 0){
            System.out.println("Такого прямоугольника не существует.");
        }
        else
            System.out.println("Плошадь прямоугольника = " + result);
        return  result;
    }

    public static double Calc(double a, double b, double c){
        double result, p;
        p = (a + b + c )/2;
        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if(p <= a || p <= b || p <= c ){
            System.out.println("Такого треугольника не существует.");
        }
        else
            System.out.println("Площадь треугольника = "  + result);
        return result;
    }
}
