# TutorialsPoint
Follow up on Springboot :)

Spring Boot - Runners
- Allow you to perform any actions(execute the code) immediately after the application has started

1. Application Runner
- An interface used to execute the ode after the SpringBoot application started.

Sample code
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBoot application
public class Dem
public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}
@Override
public void run(ApplicationArguments arg0) throws Exception {
System.out.println("Hello World from Application Runner");
}
}

2. Command Line Runner
- An interface used to execute the code after the Spring Booot apllication started

Sample code
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends CommandLineRunner{
    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);
    }
    @Override
    public void run(String... arg0) throws Exception{
        System.out.println("Hello from Command Line Runner");
    }
}

When to Use Which?
CommandLineRunner: Use when you just need raw arguments and don’t care about structured or parsed input.
ApplicationRunner: Use when the application arguments require better parsing or if you expect key-value pairs or flags.