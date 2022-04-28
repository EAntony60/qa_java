package com.example.lionTests;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionGetKittensWithParametersMethodTest {
    private final int expected;
    private final int kittensCount;

    public LionGetKittensWithParametersMethodTest(int expected, int kittensCount) {
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][] {
            {0, 0},
            {2, 2},
            {10, 10}
        };
    }

    @Test
    public void shouldBeRightKittensCount() throws Exception{
        Lion lion = new Lion("Самец");
//        int actual = lion.getKittens(kittensCount);
    }
}
