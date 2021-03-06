package com.geeks;

import com.geeks.bean.Customer;
import com.geeks.bean.Email;
import com.geeks.bean.SMS;
import com.geeks.bean.Store;
import com.geeks.config.BeanConfigurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfigurations.class);

        Store mantoko = (Store) applicationContext.getBean("store");
        mantoko.transaction(2);
        mantoko.transaction(4);
        mantoko.transaction(5);
        mantoko.transaction(7);

    }
}
