package com.spring.events;

import org.springframework.context.ApplicationListener;

import javax.swing.*;

public class ChangeMobileListener implements ApplicationListener<ChangeMobileEvent> {

    public void onApplicationEvent(ChangeMobileEvent event) {


        if (event.getSource() instanceof Atm) {
            Atm atm = (Atm) event.getSource();
                JOptionPane.showMessageDialog(null, "New mobile Number is: " + atm.getMobileNumber());
            }
        }
    }

