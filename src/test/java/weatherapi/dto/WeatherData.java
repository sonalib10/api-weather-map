package weatherapi.dto;

import java.util.List;

public class WeatherData {

    private Long dt;
    private Temp temp;
    private Long pressure;
    private List<Weather> weather;
    private Long speed;
    private Long deg;
    private Long clouds;
    private Long snow;
    private Long humidity;

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Long getDeg() {
        return deg;
    }

    public void setDeg(Long deg) {
        this.deg = deg;
    }

    public Long getClouds() {
        return clouds;
    }

    public void setClouds(Long clouds) {
        this.clouds = clouds;
    }

    public Long getSnow() {
        return snow;
    }

    public void setSnow(Long snow) {
        this.snow = snow;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }
}
