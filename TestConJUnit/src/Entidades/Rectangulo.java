/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

public class Rectangulo{
    private Double ancho;
    private Double largo;
    private String color;
    private Boolean active;

    public Rectangulo() {
    }

    public Rectangulo(Double ancho, Double largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = "rojo";
        this.active = true;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    
}
