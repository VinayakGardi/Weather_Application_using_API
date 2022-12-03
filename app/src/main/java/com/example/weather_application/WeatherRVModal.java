package com.example.weather_application;

public class WeatherRVModal {
    private String time;
    private String windSpeed;
    private String temperature;
    private String icon;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public WeatherRVModal(String time, String windSpeed, String temperature, String icon) {
        this.time = time;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.icon = icon;
    }
}
