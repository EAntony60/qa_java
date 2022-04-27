package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionGetKittensMethodTest {
    private static final String sex = "Самец";
    private final int expected;
    private final int kittensCount;

    public LionGetKittensMethodTest(int expected, int kittensCount) {
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {7, 7},
                {5, 5},
                {1, 1},
                {0, 0}
        };
    }

    @Test
    public void shouldBeRightNumberOfKittens() throws Exception{
        Lion lion = new Lion(sex);
        int actual;
        if (expected == 1) {
            actual = lion.getKittens();
        } else {
            actual = lion.getKittens(kittensCount);
        }
        assertEquals(expected, actual);
    }
}
