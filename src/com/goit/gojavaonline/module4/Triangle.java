package com.goit.gojavaonline.module4;


public class Triangle implements Figure{

    private double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double square(Figure name) {

        double result, p;
        p = (name.getA() + name.getB() + name.getC() )/2;
        result = Math.sqrt(p * (p - name.getA()) * (p - name.getB()) * (p - name.getC()));
        if(p <= name.getA() || p <= name.getB() || p <= name.getC() ){
            try {
                throw new InvalidParametersOfFigureException();
            } catch (InvalidParametersOfFigureException e) {
                System.out.println("Invalid figure parametrs. This triangle does not exist");
            } return -1;
        }
        else

        return result;
    }

    @Override
    public double getR() {
        return 0;
    }
}
