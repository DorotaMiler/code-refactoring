package org.infoshareacademy;

public class Zadanie15 {
    public int mojInteger;
    private double mojDouble;
    public static final int STALA = 0;

    public void publicMethod() {
        System.out.println("Stala =" + STALA);
    }

    public void hiddenMethod() {
        setMojInteger(10);
        setMojDouble(10d);
    }

    public double getMojDouble() {
        return mojDouble;
    }

    public void setMojDouble(final double mojDouble) {
        this.mojDouble = mojDouble;
    }

    public int getMojInteger() {
        return mojInteger;
    }

    public void setMojInteger(final int mojInteger) {
        this.mojInteger = mojInteger;
    }
}
