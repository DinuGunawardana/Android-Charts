package com.example.chartappfire;

public class PointValue {

    int xValue, yValue;

    public PointValue(int xValue, int yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public PointValue() {
    }

    public int getxValue() {
        return xValue;
    }

    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public void setyValue(int yValue) {
        this.yValue = yValue;
    }
}
