package com.spring.events;

public interface AtmDao {

    public Atm withdraw(Integer pin);
    public Atm changePin(Integer pin);
    public Atm changeMobileNumber(Integer pin);
}
