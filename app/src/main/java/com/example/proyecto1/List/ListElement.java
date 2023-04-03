package com.example.proyecto1.List;

public class ListElement {
    public String color;
    public String name;
    public String tipo;
    public String status;

    //constructor
    public ListElement(String color, String name, String tipo, String status) {
        this.color = color;
        this.name = name;
        this.tipo = tipo;
        this.status = status;
    }

    //get and set
    public String getColor() {
        return color;
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
