package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyMethodTest {
    private final String expected = "Кошачьи";

    @Test
    public void shouldBeReturnFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}
