package com.example.catTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundMethodTest {
    private final String expected = "Мяу";

    @Test
    public void shouldSayMew() {
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}
