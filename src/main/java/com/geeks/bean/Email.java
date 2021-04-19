package com.geeks.bean;

import org.springframework.stereotype.Component;

@Component
public class Email extends Notification {

    @Override
    public String bodyMessage(int gold) {
        return "Terima Kasih Atas Pesananan Anda \n" +
                "Dear "+customer.name+"\n" +
                "Pesanan anda telah berhasil, total emas yang di beli adalah "+gold+"\n" +
                "Name: "+customer.name+"\n" +
                "Email: "+customer.email+"\n" +
                "\n\n" +
                "==created by email==";
    }
}
