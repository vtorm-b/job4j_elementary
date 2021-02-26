package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1,10);
        int expected = 30;
        assertThat(rsl,is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty1() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}