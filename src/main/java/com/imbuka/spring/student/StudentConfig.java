package com.imbuka.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alvin = new Student(

                    "Alvin",
                    "alvin@qwosha.com",
                    LocalDate.of(1999, Month.NOVEMBER, 22)
            );

            Student stella = new Student(

                    "Stella",
                    "stella@qwosha.com",
                    LocalDate.of(2000, Month.JANUARY, 4)
            );

            repository.saveAll(
                    List.of(alvin, stella)
            );


        };
    }
}
