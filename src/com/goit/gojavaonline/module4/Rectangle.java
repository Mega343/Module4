package com.goit.gojavaonline.module4;


public class Rectangle implements Figure {

    private double a,b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double square(Figure name) {

        double result;
        result = name.getA() * name.getB();
        if(result <= 0){
            System.out.println("Такого прямоугольника не существует.");
        }
        else
            System.out.println("Плошадь прямоугольника = " + result);
        return  result;
    }

    @Override
    public double getR() {
        return 0;
    }

    @Override
    public double getC() {
        return 0;
    }
}
