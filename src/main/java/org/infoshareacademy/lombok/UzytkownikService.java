package org.infoshareacademy.lombok;

import lombok.extern.slf4j.Slf4j;

public class UzytkownikService {

    private Uzytkownik utworzUzytkownika(final String imie, final String nazwisko, final Integer wiek) {
        return Uzytkownik
            .builder()
            .imie(imie)
            .nazwisko(nazwisko)
            .wiek(wiek)
            .build();
    }

    public void obiektUzytkownika(){
        final Uzytkownik uzytkownik = utworzUzytkownika("Maciej", "Adamski", 31);
        //Zobacz jakie wartości ma dostepne uzytkownik i czy mozna je zmienic?

        UzytkownikRequiredArgsContructor uzytkownikRequiredArgsContructor = new UzytkownikRequiredArgsContructor("Maciej","Drugi",11);

        UzytkownikPrzyklady uzytkownikPrzyklady = new UzytkownikPrzyklady("Imie");
        uzytkownikPrzyklady.setNazwisko("nazwisko");
        uzytkownikPrzyklady.setPassword("Haslo");
        //Lecz nie mamy getterow dla wszystkich pol
        //uzytkownikPrzyklady.getNazwisko();
    }

}
