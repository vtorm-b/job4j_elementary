package ru.job4j.calculate;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class X2Test extends TestCase {
@Test
    public void testCalc() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
        public void testCalc1() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
            public void testCalc2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
    @Test
            public void testCalc3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rsl = X2.calc(a,b,c,x);
        Assert.assertEquals(expected,rsl);
    }
}