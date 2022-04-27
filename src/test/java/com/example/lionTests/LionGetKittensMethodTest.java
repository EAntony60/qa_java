package com.example.lionTests;

import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionGetKittensMethodTest {

    @Test
    public void shouldBeOneKitten() throws Exception{
        int expected = 1;
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        assertEquals(expected, actual);
        System.out.println("Метод getKittens возвращает: " + actual);
    }
}
