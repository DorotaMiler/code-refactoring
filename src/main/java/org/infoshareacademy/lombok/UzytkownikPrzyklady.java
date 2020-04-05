package org.infoshareacademy.lombok;

import lombok.*;

@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class UzytkownikPrzyklady {

    @Getter
    private final String imie;
    private String nazwisko;
    private Integer wiek;

    @ToString.Exclude
    private String password;
}
