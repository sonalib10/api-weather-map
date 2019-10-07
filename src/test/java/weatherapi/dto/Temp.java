package weatherapi.dto;

public class Temp {

    private Long day;
    private Long min;
    private Long max;
    private Long night;
    private Long eve;
    private Long morn;

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Long getNight() {
        return night;
    }

    public void setNight(Long night) {
        this.night = night;
    }

    public Long getEve() {
        return eve;
    }

    public void setEve(Long eve) {
        this.eve = eve;
    }

    public Long getMorn() {
        return morn;
    }

    public void setMorn(Long morn) {
        this.morn = morn;
    }
}
