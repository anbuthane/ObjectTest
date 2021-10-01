package in.frontlinetech;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class EnumEx
{
    enum Weekday { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
    public static void main(String[] args) {

        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        //EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        //EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
      //  EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);

List single = Collections.singletonList(new Product());
        System.out.println(single.size());
    }
}
