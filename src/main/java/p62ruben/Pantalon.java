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
public final class Pantalon extends Ropa {

    private String talla;

    public Pantalon(String talla, String marca, String codigo, double precio, int iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public Pantalon(String talla, String marca) {
        super(marca);
        this.talla = talla;
    }

    public Pantalon(String talla) {
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + "Pantalon{" + "talla=" + talla + '}'+"\n";
    }

    @Override
    public void enviar(String dir) {
        System.out.println("El pantalón se ha enviado a " + dir);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.talla);
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
        final Pantalon other = (Pantalon) obj;
        return Objects.equals(this.talla, other.talla);
    }
    
    

}
