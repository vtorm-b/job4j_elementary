package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class SqAreaTest extends TestCase {
@Test
    public void testSquare() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);

    }
    @Test
    public void whenp6k2s2() {
        int k = 1;
        int p = 4;
        int expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected,out,0.01);
    }
}