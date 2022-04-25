package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionGetKittensMethodTest {
    private static final String sex = "Самец";

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldBeOneKitten() throws Exception{
        Lion lion = new Lion(sex);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeFiveKittens() throws Exception{
        Lion lion = new Lion(sex);
        int expected = 5;
        int actual = lion.getKittens(5);
        assertEquals(expected, actual);
    }
}
