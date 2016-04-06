package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.Circle;
import com.goit.gojavaonline.module4.InvalidParametersOfFigureException;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class CircleTest {
    private static Circle circle;
    private static Circle circle2;
    private static final double r = 3.5;
    private static final double r0 = 0;

    @BeforeClass
    public static void  setUpClass() throws Exception {
        circle = new Circle(r);
        circle2 = new Circle(r0);
    }

    @Test(timeout = 1000)
    public void testSquare() throws Exception {

        double result = circle.square(circle);

        Assert.assertEquals(Math.PI*r*r, result);

    }

    @Test(expected = Exception.class)
    public void testSquareException() throws InvalidParametersOfFigureException {

       circle.square(circle2);

       throw new InvalidParametersOfFigureException();

    }

}