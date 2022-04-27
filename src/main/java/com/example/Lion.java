package com.example;

import java.util.List;

public class Lion{

    public List<String> eatMeat() throws Exception {
        return List.of("Животные", "Птицы", "Рыба");
    }

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public String getFamily() {
        return "Кошачьи";
    }

}
