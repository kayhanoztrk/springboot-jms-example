package com.springbootjms.jmssample.component;

import com.springbootjms.jmssample.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Component
public class Receiver {

    private Logger logger = LoggerFactory.getLogger(Receiver.class);

    @JmsListener(destination = "userbox", containerFactory = "myFactory")
    public void receiveMessage(User user) {
        System.out.println("Received <" + user + ">");
        logger.info("userInfo:", user);
    }

}