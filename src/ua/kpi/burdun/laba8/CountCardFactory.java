package ua.kpi.burdun.laba8;

import static ua.kpi.burdun.laba8.PrintClass.print;
import static ua.kpi.burdun.laba8.Types.count;

public class CountCardFactory {

    public static CountCards generateCard(Types types) {
        switch (types) {
            case count:
                print("Count card for 0 travels is being created");
                return new CountCards(0);
            default:
                return null;
        }
    }
}
