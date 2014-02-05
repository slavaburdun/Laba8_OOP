package ua.kpi.burdun.laba8;

import static ua.kpi.burdun.laba8.Types.*;

public class TravelCardFactory {

    public static TravelCard generateCard(Types types) {
        switch (types) {
            case averageMonth:
                return MonthCardFactory.generateCard(averageMonth);
            case count:
                return CountCardFactory.generateCard(count);
            case numberAverageFive:
                return NumberOfTravelsCardFactory.generateCard(numberAverageFive);
            case numberAverageTen:
                return NumberOfTravelsCardFactory.generateCard(numberAverageTen);
            case numberSchoolFive:
                return NumberOfTravelsCardFactory.generateCard(numberSchoolFive);
            case numberSchoolTen:
                return NumberOfTravelsCardFactory.generateCard(numberSchoolTen);
            case numberStudentFive:
                return NumberOfTravelsCardFactory.generateCard(numberStudentFive);
            case numberStudentTen:
                return NumberOfTravelsCardFactory.generateCard(numberStudentTen);
            case schoolMonth:
                return MonthCardFactory.generateCard(schoolMonth);
            case studentMonth:
                return MonthCardFactory.generateCard(studentMonth);
            default:
                return null;
        }
    }
}
