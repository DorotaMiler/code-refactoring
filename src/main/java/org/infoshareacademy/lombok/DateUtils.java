package org.infoshareacademy.lombok;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateUtils {

    public static LocalDate now(){
        return LocalDate.now();
    }

    public static String formatToBasicIsoDate(LocalDate localDate) {
        return localDate == null ? null : localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
    }

    public static LocalDate toLocalDate(String localDateAsString) {
        return StringUtils.isBlank(localDateAsString) ? null : LocalDate.parse(localDateAsString, DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
