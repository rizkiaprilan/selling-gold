package com.geeks.bean;


import java.util.UUID;

public abstract class Notification {
    public Customer customer;

    public Notification(Customer customer) {
        this.customer = customer;
    }

    public abstract String bodyMessage(int gold);
}
