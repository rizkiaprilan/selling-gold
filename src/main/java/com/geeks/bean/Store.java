package com.geeks.bean;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Store {
    @Autowired
    @Qualifier(value = "email")
    public Notification notif;
    public int stock = 100;

    public void transaction(int gold) {
        this.stock -= gold;
        System.out.println(this.notif.bodyMessage(gold));
        System.out.println("remaining gold: " + this.stock);
    }
}
