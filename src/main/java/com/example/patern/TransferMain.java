package com.example.patern;

import com.example.patern.config.AppConfig;
import com.example.patern.model.Amount;
import com.example.patern.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransferMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transferAmmount(100L, 200L, new Amount(2000.0));

        applicationContext.close();
    }
}
