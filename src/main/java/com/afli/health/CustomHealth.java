package com.afli.health;

public class CustomHealth {

    public final Status response;

    public CustomHealth(Status response) {
        this.response = response;
    }

    public enum Status {
        OK
    }
}
