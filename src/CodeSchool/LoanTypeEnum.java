package CodeSchool;

import java.time.LocalDate;

public enum LoanTypeEnum {

    //varki tesaknery yst tokosi chapi ev qani tarov

    SPAROXAKAN(10, 10),
    LOMBARDAYIN(5, 4),
    AVTOVARKER(7, 8),
    USUMNAKAN(6, 7),
    AREVTRAYIN(20, 30),
    GYUXATNTESAKAN(4, 9),
    HIPOTEKAYIN(7, 2);

    int percent;
    String term;

    LoanTypeEnum(int percent, int coutOfYear) {
        LocalDate now = LocalDate.now();
        String time = now.toString();

        int year = Integer.parseInt(time.substring(0, 4)) + coutOfYear;
        String newYear = String.valueOf(year);
        time = newYear + time.substring(4);

        this.percent = percent;
        this.term = time;
    }
}
