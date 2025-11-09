package com.example.project_prm.model;

public class CreatePaymentResponse {
    boolean success;
    String qr_url;
    String description;

    public boolean isSuccess() { return success; }
    public String getQr_url() { return qr_url; }
    public String getDescription() { return description; }
}
