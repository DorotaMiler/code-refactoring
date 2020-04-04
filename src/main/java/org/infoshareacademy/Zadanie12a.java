package org.infoshareacademy;

import static java.lang.Boolean.FALSE;

public class Zadanie12a {

    public Zadanie12 poleZadanie12;

    public void metodaUzywajacaZadania12() {
        poleZadanie12.setMojBoolean(Boolean.TRUE);
        poleZadanie12.setMojString("String");
        poleZadanie12.setMojInteger(10);

        final Zadanie12 zmiennaZadanie12 =
            new Zadanie12("String2", 1, FALSE);
    }
}
