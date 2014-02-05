package ua.kpi.burdun.laba8;

public final class NumberOfTravelsCards extends TravelCard {

    private Integer numberOfTravels;

    public NumberOfTravelsCards(Integer numberOfTravels, String type) {
        this.numberOfTravels = numberOfTravels;
        this.type = type;
    }

    public Integer getNumberOfTravels() {
        return numberOfTravels;
    }

    public void setNumberOfTravels(Integer numberOfTravels) {
        this.numberOfTravels = numberOfTravels;
    }
}
