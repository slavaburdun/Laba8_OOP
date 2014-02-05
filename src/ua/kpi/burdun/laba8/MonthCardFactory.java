package ua.kpi.burdun.laba8;

import java.util.Calendar;
import static ua.kpi.burdun.laba8.PrintClass.print;

public class MonthCardFactory {

    private static MonthCards card;

    private static MonthCards monthRide(String param) {
        card = new MonthCards(param);
        Calendar current = Calendar.getInstance();
        current.set(Calendar.MONTH, current.get(Calendar.MONTH) + 1);
        card.setExpirationDate(current);
        return card;
    }

    public static TravelCard generateCard(Types types) {
        switch (types) {
            case averageMonth:
                print("Average card for one month is being created");
                return monthRide("average");
            case schoolMonth:
                print("School Card for month is being created");
                return monthRide("school");
            case studentMonth:
                print("Student Card for month is being created");
                return monthRide("student");
            default:
                return null;
        }
    }
}
