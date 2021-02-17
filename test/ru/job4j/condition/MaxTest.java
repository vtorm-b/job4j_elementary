package ru.job4j.condition;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(4,2);
        assertThat(result, is(4));


    }
}