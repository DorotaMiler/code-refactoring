package org.infoshareacademy.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UzytkownikRequiredArgsContructor {
    private final String imie;
    private final String nazwisko;
    private final Integer wiek;
}
