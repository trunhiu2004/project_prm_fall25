package com.example.project_prm.model;

public class OrderCreateResponse {
    boolean success;
    String message;
    int iddonhang;

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public int getIddonhang() { return iddonhang; }
}
