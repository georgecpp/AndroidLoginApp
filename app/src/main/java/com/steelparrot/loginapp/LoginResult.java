package com.steelparrot.loginapp;

import com.google.gson.annotations.SerializedName;

public class LoginResult {

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private String name;

    private String email;
}
