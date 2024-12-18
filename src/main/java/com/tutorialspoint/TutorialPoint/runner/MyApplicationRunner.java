package com.tutorialspoint.TutorialPoint.runner;

import org.springframework.boot.ApplicationArguments; //Import for advanced argument handling
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component //Mark this class a spring managed bean
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println("ApplicationRunner executed!");
        args.getOptionNames().forEach(option ->
                System.out.println(option + ": " + args.getOptionValues(option))
        );
    }
}


/*
Execution Order of Runners
By default, both runners will execute, but their execution order is not guaranteed unless
explicitly specified. To control the order:
Use the @Order annotation.
Implement the Ordered interface.

@Component
@Order(1) // CommandLineRunner will execute first
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner executed first!");
    }
}

@Component
@Order(2) // ApplicationRunner will execute second
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner executed second!");
    }
}

 */