package ua.kpi.burdun.laba8;

import static ua.kpi.burdun.laba8.Types.*;

public class Main {

    public static void main(String... args) {
        MonthCards a = (MonthCards)MainSystem.getCardOfType(schoolMonth);
        System.out.println(a.getExpirationDate().getTime());
        System.out.println(a.type);
        System.out.println();
        
        MonthCards b = (MonthCards)MainSystem.getCardOfType(studentMonth);
        System.out.println(b.getExpirationDate().getTime());
        System.out.println(b.type);
        System.out.println();
        
        NumberOfTravelsCards c = (NumberOfTravelsCards)MainSystem.getCardOfType(numberSchoolFive);
        System.out.println(c.getNumberOfTravels());
        System.out.println(c.type);
        System.out.println();
        
        CountCards f = (CountCards)MainSystem.getCardOfType(count);
        System.out.println(f.getSum());
        System.out.println(f.type);
        MainSystem.insreaseCount(f, 2);
        System.out.println();
        
        Tourniquete z = new Tourniquete();
        z.acceptCard(a);
        z.acceptCard(b);
        z.acceptCard(c);
        z.acceptCard(f);
        z.acceptCard(f);
        MainSystem.listOfBlockedCards();
        MainSystem.insreaseCount(f, 500);
        z.acceptCard(f);
        MainSystem.listOfBlockedCards();
        z.printAllStatistics();
        z.getTypeStatistics();
    }
}
