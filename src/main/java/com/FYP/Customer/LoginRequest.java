package com.FYP.Customer;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {
    @NotBlank(message = "The username or email should not be empty")
    private String username;
    @NotBlank(message = "The password should not be empty")
    private String password;
}
