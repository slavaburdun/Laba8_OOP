package ua.kpi.burdun.laba8;

public abstract class TravelCard {

    protected Integer id;
    protected String type;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
