package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;
    private final boolean expected;
    private final String expectedException = "Используйте допустимые значения пола животного - самец или самка";

    public LionSexTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Смец", false}
        };
    }

    @Test
    public void methodShouldReturnCorrectSex() throws Exception{
        try {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        } catch (Exception e) {
            Assert.assertEquals(expectedException, e.getMessage());
        }
    }

}