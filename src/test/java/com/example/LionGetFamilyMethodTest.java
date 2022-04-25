package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionGetFamilyMethodTest {
    private static String expected = "Кошачьи";
    private static String sex = "Самка";

    @Test
    public void shouldBeFeline() throws Exception{
        Lion lion = new Lion(sex);
        String actual = lion.getFamily();
        assertEquals(expected, actual);
    }
}
