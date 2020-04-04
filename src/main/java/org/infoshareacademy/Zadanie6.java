package org.infoshareacademy;

import java.util.Random;

public class Zadanie6 {

    private Long poleTypuLong = new Random().nextLong();
    private int a = 10;

    public void metoda() {
        int number = poleTypuLong.intValue();
        int b = a + number;
    }
}
