package com.geeks.bean;

public class Store {
    public int stock = 100;
    public Notification notif;

    public Store(Notification notif) {
        this.notif = notif;
    }

    public void transaction(int gold){
        this.stock -= gold;
        System.out.println(this.notif.bodyMessage(gold));
    }
}
