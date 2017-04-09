package com.spring.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeeDao");

        List<Employee> inputs = new ArrayList<Employee>();
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setName("abc");
        emp1.setEmailId("abc@gmail.com");
        emp1.setSalary(50000);
        inputs.add(emp1);

        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setName("xyz");
        emp2.setEmailId("xyz@gmail.com");
        emp2.setSalary(150000);
        inputs.add(emp2);

        Employee emp3 = new Employee();
        emp3.setEmpId(3);
        emp3.setName("def");
        emp3.setEmailId("def@gmail.com");
        emp3.setSalary(1500);
        inputs.add(emp3);

        Employee emp4 = new Employee();
        emp4.setEmpId(4);
        emp4.setName("ghi");
        emp4.setEmailId("ghi@gmail.com");
        emp4.setSalary(250000);
        inputs.add(emp4);

        EventPublisher publisher = applicationContext.getBean("eventPublisher",EventPublisher.class);
        CustomEvent event = new CustomEvent(emp1);
        CustomEvent event1 = new CustomEvent(emp2);
        CustomEvent event2 = new CustomEvent(emp3);
        CustomEvent event3 = new CustomEvent(emp4);
        publisher.publish(event);
        publisher.publish(event1);
        publisher.publish(event2);
        publisher.publish(event3);
        employeeDao.insertEmployeeRecords(inputs);

    }

}

