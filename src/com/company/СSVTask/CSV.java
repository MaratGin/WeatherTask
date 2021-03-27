package com.company.СSVTask;

import java.util.Date;

public class CSV {
    private Date date;
    private Double temperature;
    private Double humidity;
    private Double speed;
    private Double direction;

    public Date getDate() {
        return date;
    }


    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getDirection() {
        return direction;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setDirection(Double direction) {
        this.direction = direction;
    }


    public CSV(Date date, Double temperature, Double humidity, Double speed, Double direction) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.speed = speed;
        this.direction = direction;
    }



    @Override
    public String toString() {
        return "CSV{" +
                "temperature=" + temperature +
                ", humidity='" + humidity + '\'' +
                ", speed=" + speed +
                ", direction=" + direction +
                '}';
    }

}
