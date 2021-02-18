package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class FitTest extends TestCase {

    public void testManWeight() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testWomanWeight() {
        short in1 = 187;
        double expected1 = 88.55;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(expected1, out1, 0.01);
    }
}