package com.geeks.bean;

import org.springframework.stereotype.Component;

@Component
public class SMS extends Notification{

    @Override
    public String  bodyMessage(int gold) {
        return "Terima Kasih Atas Pesananan Anda \n" +
                "Dear "+customer.name+"\n" +
                "Pesanan anda telah berhasil, total emas yang di beli adalah "+gold+"\n" +
                "Name: "+customer.name+"\n" +
                "Phone Number: "+customer.phoneNumber+"\n" +
                "\n\n" +
                "==created by SMS==";
    }
}
