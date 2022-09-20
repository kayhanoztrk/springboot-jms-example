package com.springbootjms.jmssample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import java.io.IOException;

@SpringBootApplication
@EnableJms
public class JmssampleApplication {

    private static Logger logger = LoggerFactory.getLogger(JmssampleApplication.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(JmssampleApplication.class, args);
    }

}
