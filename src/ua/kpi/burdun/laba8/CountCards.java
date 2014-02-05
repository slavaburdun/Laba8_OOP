package ua.kpi.burdun.laba8;

public final class CountCards extends TravelCard {

    private Integer sum;

    public CountCards(Integer sum) {
        this.sum = sum;
        this.type = "average";
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
