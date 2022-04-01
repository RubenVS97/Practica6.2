/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62ruben;

import java.util.Objects;

/**
 *
 * @author ruben
 */
public abstract class Ropa extends Producto implements SeEnvia{

    private String marca;

    public Ropa(String marca, String codigo, double precio, int iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public Ropa(String marca) {
        this.marca = marca;
    }

    public Ropa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + "Ropa{" + "marca=" + marca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (! super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }
    
    
    
}
