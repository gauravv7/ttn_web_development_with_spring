package com.spring.events;

import org.springframework.context.ApplicationListener;

import javax.swing.*;

public class SmsListener implements ApplicationListener<SmsEvent> {


    public void onApplicationEvent(SmsEvent event) {

        if (event.getSource() instanceof Atm) {
            Atm atm = (Atm) event.getSource();
            System.out.println("Withdraw event fired");
            JOptionPane.showMessageDialog(null, "Left amount is: " + atm.getBalance());


        }
    }
}


