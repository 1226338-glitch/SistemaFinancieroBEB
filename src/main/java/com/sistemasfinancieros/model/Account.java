package com.sistemasfinancieros.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private Long accountId;
    private Long clientId;
    private String numeroCuenta;
    private String tipoCuenta;
    private BigDecimal saldo;
    private LocalDateTime fechaApertura;
    private boolean activa;

    public Account(Long accountId, Long clientId, String numeroCuenta, String tipoCuenta, BigDecimal saldo, LocalDateTime fechaApertura, boolean activa) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.activa = activa;
    }

    // Getters and Setters
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDateTime fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}