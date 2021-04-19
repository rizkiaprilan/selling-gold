package com.geeks.bean;

public class SMS extends Notification{
    public SMS(Customer customer) {
        super(customer);
    }

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
