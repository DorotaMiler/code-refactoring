package org.infoshareacademy;

public class Zadanie3 {

    private DrugaKlasa drugaKlasa = new DrugaKlasa();

    public int dodawanie(){
        int a = 1;
        int b = a + drugaKlasa.jakasLiczba.intValue();
        int c = b + drugaKlasa.jakasLiczba.intValue();
        return c;
    }
}
