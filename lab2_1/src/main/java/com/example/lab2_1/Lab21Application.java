package com.example.lab2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.lab2_1.days.*;

@SpringBootApplication
public class Lab21Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab21Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.lab2_1.configs", "com.example.lab2_1.days");

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }

}
