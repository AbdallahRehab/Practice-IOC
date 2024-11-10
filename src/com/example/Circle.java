package com.example;

public class Circle implements Shape {


    @Override
    public void getArea(double r) {
        double area = Math.PI * r * r;
        System.out.println("the area of the circle = " + area);
    }

    @Override
    public void getArea(double x, double y) {

    }
}
