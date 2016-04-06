package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.InvalidParametersOfFigureException;
import com.goit.gojavaonline.module4.Triangle;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {

    private static Triangle triangle;
    private static Triangle triangle2;
    private static double a = 3.8;
    private static double b = 2.7;
    private static double c = 3;
    private static double d = 0;

    @BeforeClass
    public static void  setUpClass() throws Exception {
        triangle = new Triangle(a , b, c);
        triangle2 = new Triangle(c, a, d);
    }

    @Test(timeout = 1000)
    public void testSquare() throws Exception {

        double result = triangle.square(triangle);

        Assert.assertEquals(Math.sqrt(((a+b+c)/2) * (((a+b+c)/2) - a) * (((a+b+c)/2) - b) * (((a+b+c)/2) - c)), result);

    }

    @Test(expected = Exception.class)
    public void testSquareException() throws InvalidParametersOfFigureException {

        triangle.square(triangle2);

        throw new InvalidParametersOfFigureException();

    }
}