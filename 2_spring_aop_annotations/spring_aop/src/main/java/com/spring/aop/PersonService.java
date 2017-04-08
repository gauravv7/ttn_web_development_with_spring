package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class PersonService {

    public void removePerson() {

        System.out.println("Removing user");
    }

    public void setPerson(String name) {

        System.out.println("Name: " + name);
    }

    public String getPerson() {

        return "abc";
    }


}
