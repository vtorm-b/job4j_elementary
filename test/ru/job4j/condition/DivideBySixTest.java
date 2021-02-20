package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void checkNumber() {
        String expected = "Исходное число делится на 6.";
        assertThat(DivideBySix.checkNumber(24), is(expected));
    }
}