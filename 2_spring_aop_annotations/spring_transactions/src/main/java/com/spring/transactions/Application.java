package com.spring.transactions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.create("abc",15000);
        accountDao.create("def",25000);
        accountDao.create("ghi",7000);
        accountDao.update("abc",80000);
        accountDao.delete("ghi");
        accountDao.getDetails("def");

        AccountTransfer accountTransfer = applicationContext.getBean(AccountTransfer.class);
        accountTransfer.transferAmount("abc","def");
        accountTransfer.transferAmount("abc","def");
        accountTransfer.transferAmountUsingAnnotation("abc","def");
        accountService.transferAmount("abc","def",100);
    }
}
