package com.it;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableTransactionManagerServer
@SpringBootApplication
public class txLCNApplication {
    public static void main(String[] args) {
        SpringApplication.run(txLCNApplication.class, args);
    }

}
