package com.springbootjms.jmssample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String surName;
}
