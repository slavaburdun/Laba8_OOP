package ua.kpi.burdun.laba8;

import java.util.Calendar;

public final class MonthCards extends TravelCard {

    private Calendar expirationDate;

    public MonthCards(String type) {
        this.type = type;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }
}
