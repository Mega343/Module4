package com.goit.gojavaonline.module4;


public class Calculate {

public static double calcCircle(Figure name){
    double result;
    final double PI = 3.14;
    result = PI*name.getR()*name.getR();
    if(result <= 0){
        System.out.println("Такого круга не существует.");
        }
    else
        System.out.println("Площадь круга = " + result);
    return result;
    }

    public static double calcRectangle(Figure name){
        double result;
        result = name.getA() * name.getB();
        if(result <= 0){
            System.out.println("Такого прямоугольника не существует.");
        }
        else
            System.out.println("Плошадь прямоугольника = " + result);
        return  result;
    }

    public static double calcTriangle(Figure name){
        double result, p;
        p = (name.getA() + name.getB() + name.getC() )/2;
        result = Math.sqrt(p * (p - name.getA()) * (p - name.getB()) * (p - name.getC()));
        if(p <= name.getA() || p <= name.getB() || p <= name.getC() ){
            System.out.println("Такого треугольника не существует.");
        }
        else
            System.out.println("Площадь треугольника = "  + result);
        return result;
    }
}
