package com.spring.events;

import org.springframework.context.ApplicationListener;

import javax.swing.*;

public class ChangePinListener implements ApplicationListener<ChangePinEvent> {

    public void onApplicationEvent(ChangePinEvent event) {

        if (event.getSource() instanceof Atm) {
            Atm atm = (Atm) event.getSource();
            System.out.println("Change pin event fired..");
            JOptionPane.showMessageDialog(null,"New Pin is: " +atm.getPin());
        }
    }
}
