package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineEatMeatMethodTest {
    private final List<String> expected = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void shouldReturnFoodForPredator() throws Exception{
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}
