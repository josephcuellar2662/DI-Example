package com.springframework.diexample;

import com.springframework.diexample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {

        ApplicationContext ctc = SpringApplication.run(DiExampleApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

        controller.hello();
    }

}
