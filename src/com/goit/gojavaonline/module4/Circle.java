package com.goit.gojavaonline.module4;


public class Circle implements Figure {


    double r;
    public final double PI = 3.14;

    public Circle(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double square(Figure name) {
        double result;
        result = PI*name.getR()*name.getR();
        if(result <= 0){
            System.out.println("Такого круга не существует.");
        }
        else
            System.out.println("Площадь круга = " + result);
        return result;
    }

    @Override
    public double getA() {
        return 0;
    }

    @Override
    public double getB() {
        return 0;
    }

    @Override
    public double getC() {
        return 0;
    }
}
