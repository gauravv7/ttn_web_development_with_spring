package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        PersonService personService = applicationContext.getBean(PersonService.class);
        MethClassOne methClassOne = applicationContext.getBean(MethClassOne.class);
        methClassOne.method2();
        userService.addUser();
        userService.addPerson();
        try {
            userService.throwExceptionMethod2();

        } catch (Exception e) {
        }

        userService.depricatedMethod();

        personService.removePerson();
        System.out.println(personService.getPerson());
        personService.setPerson("SPRING");
    }
}
