package ua.kpi.burdun.laba8;

import static ua.kpi.burdun.laba8.PrintClass.print;

public class MainSystem {

    private static MainSystem system;
    private static MyArrayList allCards = new MyArrayList();
    private static MyArrayList blockedCards = new MyArrayList();

    public static MainSystem getInstance() {
        if (system == null) {
            system = new MainSystem();
        }
        return system;
    }

    public static void addCardToBlackList(TravelCard card) {
        blockedCards.add(card.getId());
    }

    public static void removeCardFromBlackList(TravelCard card) {
        for (int i = 0; i < blockedCards.size(); i++) {
            if (blockedCards.get(i) == card.getId()) {
                blockedCards.remove(i);
            }
        }
    }

    public static TravelCard getCardOfType(Types type) {
        TravelCard generatedCard = TravelCardFactory.generateCard(type);
        generatedCard.setId(allCards.size());
        allCards.add(generatedCard.getId());
        return generatedCard;
    }

    public static void insreaseCount(TravelCard card, Integer sum) {
        try {
            CountCards countCard = (CountCards) card;
            countCard.setSum(countCard.getSum() + sum);
            print("Current sum on you card is: " + countCard.getSum());
            removeCardFromBlackList(card);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Only Count Cards can be "
                    + "updated, provide a valid card");
        }
    }

    public static void listOfBlockedCards() {
        blockedCards.print();
    }

    public static boolean isInBlacklist(TravelCard card) {
        for (int i = 0; i < blockedCards.size(); i++) {
            if (blockedCards.get(i) == card.getId()) {
                return true;
            }
        }
        return false;
    }
}
