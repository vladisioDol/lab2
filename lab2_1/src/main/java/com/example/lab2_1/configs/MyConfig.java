package com.example.lab2_1.configs;
import com.example.lab2_1.days.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("com.example.lab2_1.days")
public class MyConfig {
    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return switch (dayOfWeek) {
            case MONDAY -> new Monday();
            case TUESDAY -> new Tuesday();
            case WEDNESDAY -> new Wednesday();
            case THURSDAY -> new Thursday();
            case FRIDAY -> new Friday();
            case SATURDAY -> new Saturday();
            default -> new Sunday();
        };
    }
}