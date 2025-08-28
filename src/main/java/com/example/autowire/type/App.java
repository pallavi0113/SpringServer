package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] arg){
        ApplicationContext context
                =new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar=(Car) context.getBean("myCar");
        myCar.displayDetails();

    }
}
