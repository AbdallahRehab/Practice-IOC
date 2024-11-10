package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Define the container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean
        Rectangle rectangle = container.getBean("rectangle", Rectangle.class);
        rectangle.getArea(3, 3);

        Circle circle = container.getBean("circle", Circle.class);
        circle.getArea(3);

    }
}