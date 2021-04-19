package com.geeks;

import com.geeks.bean.Customer;
import com.geeks.bean.Email;
import com.geeks.bean.SMS;
import com.geeks.bean.Store;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rizki Aprilan","riskiazza@gmail.com","08034873856");
        Email userEmail = new Email(customer);
        SMS userSMS = new SMS(customer);
        Store mantoko = new Store(userEmail);

        mantoko.transaction(2);
    }
}
