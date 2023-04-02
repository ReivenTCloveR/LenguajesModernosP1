package com.example.proyecto1;

public class ListElement {
    public String color;
    public String name;
    public String tipo;
    public String status;

    public ListElement(String color, String name, String tipo, String status) {
        this.color = color;
        this.name = name;
        this.tipo = tipo;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
