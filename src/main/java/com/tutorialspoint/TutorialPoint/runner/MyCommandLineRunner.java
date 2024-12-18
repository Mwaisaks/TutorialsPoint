package com.tutorialspoint.TutorialPoint.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception{
        System.out.println("CommandLineRunner executed!");
        for (String arg : args){
            System.out.println("Argument: " + arg);
        }
    }
}

/*
If I were to break it in steps
Step 1:
Add the @Component annotation
Implement the CommandLIneRunner interface
Step 2
override the run method, make sure to throw an exception
Enter your business logic

 */
