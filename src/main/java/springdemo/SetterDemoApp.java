package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RandomCoach randomCoach = context.getBean("myRandomCoach", RandomCoach.class);

        System.out.println(randomCoach.getDailyFortune());
        System.out.println(randomCoach.getDailyWorkout());

        context.close();
    }
}
