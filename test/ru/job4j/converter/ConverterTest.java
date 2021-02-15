package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {

    @Test
   public void rubleToEuro() {
        int in = 140;
        int expecred = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expecred,out);
    }

    @Test
    public void rubleToDollar() {
        int in1 = 140;
        int expecred1 = 2;
        int out1 = Converter.rubleToDollar(in1);
        Assert.assertEquals(expecred1, out1);
       }

    @Test
    public void sizeInfo() {
        int in2 = 140;
        int expecred2 = 143360;
        int out2 = Converter.sizeInfo(in2);
        Assert.assertEquals(expecred2,out2);
    }

    @Test
    public void distInfo() {
        int in3 = 10;
        int expecred3 = 1000;
        int out3 = Converter.distInfo(in3);
        Assert.assertEquals(expecred3,out3);
    }
}