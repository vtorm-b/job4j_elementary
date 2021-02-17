package ru.job4j.condition;
import org.junit.Test;
import org.junit.Assert;
import junit.framework.TestCase;

import java.util.concurrent.locks.Condition;

public class PointTest {
/*@Test
    public void testDistance() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,out,0.01);
    }*/
   /* @Test
    public void testDistance1() {
    int expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 2;
    double out = Point.distance(x1,y1,x2,y2);
    Assert.assertEquals(expected,out,0.01);
    }*/
    @Test
    public void testDistance2() {
        int expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
