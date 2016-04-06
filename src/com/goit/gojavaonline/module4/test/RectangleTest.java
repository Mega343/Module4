package com.goit.gojavaonline.module4.test;


import com.goit.gojavaonline.module4.InvalidParametersOfFigureException;
import com.goit.gojavaonline.module4.Rectangle;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class RectangleTest {

    private static Rectangle rectangle;
    private static Rectangle rectangle2;
    private static double a = 3.2;
    private static double b = 5.7;
    private static double c = 0;

    @BeforeClass
    public static void  setUpClass() throws Exception {
        rectangle = new Rectangle(a , b);
        rectangle2 = new Rectangle(c, a);
    }

    @Test(timeout = 1000)
    public void testSquare() throws Exception {

        double result = rectangle.square(rectangle);

        Assert.assertEquals(a * b, result);

    }

    @Test(expected = Exception.class)
    public void testSquareException() throws InvalidParametersOfFigureException {

        rectangle2.square(rectangle2);

        throw new InvalidParametersOfFigureException();

    }
}