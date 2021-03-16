package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5,4,3,2};
        int el = 5;
        int result = FindLoop.indexOf(data,el);
        int expected = 0;
        Assert.assertEquals(expected,result);
    }
    @Test
    public void whenArrayHas4Then0() {
        int[] data = {4,3,2,1};
        int el = 4;
        int result = FindLoop.indexOf(data,el);
        int expected = 0;
        Assert.assertEquals(expected,result);
    }
    @Test
    public void whenArrayHas6Then0() {
        int[] data = {5,4,3,2};
        int el = 6;
        int result = FindLoop.indexOf(data,el);
        int expected = -1;
        Assert.assertEquals(expected,result);
    }
}