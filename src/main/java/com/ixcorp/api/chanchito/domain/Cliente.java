package com.ixcorp.api.chanchito.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private long id;

    @Column(name = "dni")
    private String dni;

    @Column(name =  "nombres")
    private String nombres;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "saldo")
    private long saldo;

    @Column(name = "puntos")
    private long puntos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getPuntos() {
        return puntos;
    }

    public void setPuntos(long puntos) {
        this.puntos = puntos;
    }
}
