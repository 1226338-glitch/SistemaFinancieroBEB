package com.sistemasfinancieros.model;

public class User {
    private int userId;
    private String username;
    private String email;
    private String rol;
    private boolean activo;

    public User(int userId, String username, String email, String rol, boolean activo) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.rol = rol;
        this.activo = activo;
    }

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}