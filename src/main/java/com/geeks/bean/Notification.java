package com.geeks.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public abstract class Notification {
    @Autowired
    @Qualifier(value = "customer")
    public Customer customer;


    public abstract String bodyMessage(int gold);
}
