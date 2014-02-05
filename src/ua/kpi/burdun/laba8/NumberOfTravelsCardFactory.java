package ua.kpi.burdun.laba8;

import static ua.kpi.burdun.laba8.PrintClass.print;

public class NumberOfTravelsCardFactory {

    public static NumberOfTravelsCards generateCard(Types types ) {
        switch (types) {
            case numberAverageFive:
                print("Average Card for 5 travels is being created");
                return new NumberOfTravelsCards(5, "average");
            case numberAverageTen:
                print("Average Card for 10 travels is being created");
                return new NumberOfTravelsCards(10, "average");
            case numberSchoolFive:
                print("School Card for 5 travels is being created");
                return new NumberOfTravelsCards(5, "school");
            case numberSchoolTen:
                print("School Card for 10 travels is being created");
                return new NumberOfTravelsCards(10, "school");
            case numberStudentFive:
                print("Student Card for 5 travels is being created");
                return new NumberOfTravelsCards(5, "student");
            case numberStudentTen:
                print("Student Card for 10 travels is being created");
                return new NumberOfTravelsCards(10, "student");
            default:
                return null;
        }
    }
}
