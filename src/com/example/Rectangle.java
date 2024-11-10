package com.example;

public class Rectangle implements Shape {


    @Override
    public void getArea(double r) {

    }

    @Override
    public void getArea(double x, double y) {
        double area = x * y;
        System.out.println("the area of the Square = " + area);
    }
}
