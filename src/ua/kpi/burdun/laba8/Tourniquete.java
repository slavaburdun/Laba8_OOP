package ua.kpi.burdun.laba8;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import static ua.kpi.burdun.laba8.PrintClass.print;

public class Tourniquete {

    private Calendar currentDate = Calendar.getInstance();
    private Integer sumToPass = 2;
    private LinkedHashMap<Date, String> statistics = new LinkedHashMap<>();

    public void acceptCard(TravelCard card) {
        if (validateCard(card)) {
            statistics.put(Calendar.getInstance().getTime(), card.getType() + " card "
                    + "(card type) with id " + card.getId() + " passed.");
            if (card instanceof NumberOfTravelsCards) {
                NumberOfTravelsCards numberCard = (NumberOfTravelsCards) card;
                numberCard.setNumberOfTravels(numberCard.getNumberOfTravels() - 1);
                print("Your card accepted, you have: " + numberCard.getNumberOfTravels()
                        + "travels left");

            } else if (card instanceof MonthCards) {
                MonthCards monthCard = (MonthCards) card;
                print("Your card accepted, your expiration date "
                        + "is: " + monthCard.getExpirationDate().getTime());

            } else if (card instanceof CountCards) {
                CountCards countCard = (CountCards) card;
                Integer cardSum = countCard.getSum();
                countCard.setSum(cardSum - sumToPass);
                print("Your card accepted, there are: " + countCard.getSum()
                        + " hryvnas on your account");
            }
        } else {
            stopCard(card);
        }
    }

    private Boolean validateCard(TravelCard card) {
        if (!MainSystem.isInBlacklist(card)) {
            if (card instanceof NumberOfTravelsCards) {
                NumberOfTravelsCards numberCard = (NumberOfTravelsCards) card;
                Integer numberOfTravels = numberCard.getNumberOfTravels();
                if (numberOfTravels > 0) {
                    return true;
                }
            } else if (card instanceof MonthCards) {
                MonthCards monthCard = (MonthCards) card;
                if (monthCard.getExpirationDate().after(currentDate)) {
                    return true;
                }
            } else if (card instanceof CountCards) {
                CountCards countCard = (CountCards) card;
                Integer cardSum = countCard.getSum();
                if (cardSum >= sumToPass) {
                    return true;
                }
            }
        }
        return false;
    }

    private void stopCard(TravelCard card) {
        MainSystem.addCardToBlackList(card);
        statistics.put(Calendar.getInstance().getTime(), card.getType() + " card "
                + "(card type) with id " + card.getId() + " was added to "
                + "black list.");
        if (card instanceof NumberOfTravelsCards) {
            print("Bad card inserted! Pay for additional travels "
                    + "on the nearest station!");
        } else if (card instanceof MonthCards) {
            print("Bad card inserted! Buy new month card or a card"
                    + " of another type to pass!");
        } else if (card instanceof CountCards) {
            print("Bad card inserted! Put more money on your card!");
        }
    }

    public void printAllStatistics() {
        print("Your statistics:");
        for (Date x : statistics.keySet()) {
            print(x + ": " + statistics.get(x));
        }
    }

    public void getTypeStatistics() {
        MyArrayList types = new MyArrayList();
        types.add("average");
        types.add("student");
        types.add("school");
        for (int i = 0; i < types.size(); i++) {
            print("Statistics for type " + types.get(i) + ":");
            for (Date x : statistics.keySet()) {
                if (statistics.get(x).contains((String) types.get(i))) {
                    print(x + " " + statistics.get(x));
                }
            }
        }
    }
}
