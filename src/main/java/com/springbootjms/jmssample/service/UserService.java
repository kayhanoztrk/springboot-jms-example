package com.springbootjms.jmssample.service;

import com.springbootjms.jmssample.model.User;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface UserService {
    void sendMessage(User user);
}
