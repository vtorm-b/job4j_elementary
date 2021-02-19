package ru.job4j.condition;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0,2.0,2.0);
        assertThat(result , is(true));
    }
    @Test
    public void whehTwoExist() {
        boolean result = Triangle.exist(3.0, 3.0 ,3.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenExist1() {
        boolean result = Triangle.exist(5, 3, 2);
        assertThat(result, is(false));
    }
}