package com.example.proyecto1.List;

public class ListElementR {

    public String name;
    public String dia;
    public String hora;
    public String status;

    public ListElementR(String name, String dia, String hora, String status) {
        this.name = name;
        this.dia = dia;
        this.hora = hora;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
