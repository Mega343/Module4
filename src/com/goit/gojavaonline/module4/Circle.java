package com.goit.gojavaonline.module4;


public class Circle implements Figure {


    double r;

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
        result = Math.PI*name.getR()*name.getR();
        if(result <= 0){
            try {
                throw new InvalidParametersOfFigureException();
            } catch (InvalidParametersOfFigureException e) {
                System.out.println("Invalid figure parametrs. This circle does not exist");
            } return -1;
        }
        else
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
