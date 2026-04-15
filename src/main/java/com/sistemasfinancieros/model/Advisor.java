package com.sistemasfinancieros.model;

public class Advisor {
    private int advisorId;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String especialidad;
    private List<String> clientesAsignados;
    private boolean activo;

    // Constructors
    public Advisor() {}

    public Advisor(int advisorId, String nombre, String apellido, String email, String telefono, String especialidad, List<String> clientesAsignados, boolean activo) {
        this.advisorId = advisorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.clientesAsignados = clientesAsignados;
        this.activo = activo;
    }

    // Getters and Setters
    public int getAdvisorId() { return advisorId; }
    public void setAdvisorId(int advisorId) { this.advisorId = advisorId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public List<String> getClientesAsignados() { return clientesAsignados; }
    public void setClientesAsignados(List<String> clientesAsignados) { this.clientesAsignados = clientesAsignados; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}