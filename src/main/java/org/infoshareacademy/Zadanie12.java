package org.infoshareacademy;

public class Zadanie12 {

    private String mojString;
    private Integer mojInteger;
    private Boolean mojBoolean;

    public Zadanie12(final String mojString, final Integer mojInteger, final Boolean mojBoolean) {
        this.mojString = mojString;
        this.mojInteger = mojInteger;
        this.mojBoolean = mojBoolean;
    }

    @Override
    public String toString() {
        return "Zadanie12{" +
            "mojString='" + mojString + '\'' +
            ", mojInteger=" + mojInteger +
            ", mojBoolean=" + mojBoolean +
            '}';
    }

    public String getMojString() {
        return mojString;
    }

    public void setMojString(final String mojString) {
        this.mojString = mojString;
    }

    public Integer getMojInteger() {
        return mojInteger;
    }

    public void setMojInteger(final Integer mojInteger) {
        this.mojInteger = mojInteger;
    }

    public Boolean getMojBoolean() {
        return mojBoolean;
    }

    public void setMojBoolean(final Boolean mojBoolean) {
        this.mojBoolean = mojBoolean;
    }
}
