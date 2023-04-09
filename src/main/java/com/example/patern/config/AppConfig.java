package com.example.patern.config;

import com.example.patern.aspect.LoggingAspect;
import com.example.patern.repository.AccountRepository;
import com.example.patern.repository.TransferRepository;
import com.example.patern.repository.jdbc.JdbcAccountRepository;
import com.example.patern.repository.jdbc.JdbcTransferRepository;
import com.example.patern.service.TransferService;
import com.example.patern.service.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public TransferService transferService(){
        return new TransferServiceImpl(accountRepository(), transferRepository());
    }
    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }
    @Bean
    public TransferRepository transferRepository() {
        return new JdbcTransferRepository();
    }
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
