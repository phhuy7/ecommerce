package com.han.ecommerce.storeapi.dto;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String username;
    private String email;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String avatarUrl;
}
