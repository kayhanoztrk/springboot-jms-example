package com.springbootjms.jmssample.service.impl;

import com.springbootjms.jmssample.model.User;
import com.springbootjms.jmssample.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final JmsTemplate jmsTemplate;

    public UserServiceImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendMessage(User user) {
        jmsTemplate.convertAndSend("userbox", user);
    }

    @JmsListener(destination = "userbox", containerFactory = "myFactory")
    public void receiveMessage(User user) {
        System.out.println("Received <" + user + ">");
        logger.info("userInfo:", user);
    }
}
