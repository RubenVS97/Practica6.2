/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62ruben;

/**
 *
 * @author ruben
 */
public final class LibroDigital extends Libro implements SeDescarga {

    private int numKbytes;

    public LibroDigital(int numKbytes, String isbn, String codigo, double precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKbytes = numKbytes;
    }

    public LibroDigital(int numKbytes, String isbn) {
        super(isbn);
        this.numKbytes = numKbytes;
    }

    public LibroDigital(int numKbytes) {
        this.numKbytes = numKbytes;
    }

    public int getNumKbytes() {
        return numKbytes;
    }

    public void setNumKbytes(int numKbytes) {
        this.numKbytes = numKbytes;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroDigital{" + "numKbytes=" + numKbytes + '}' + "\n";
    }

    @Override
    public void descargar() {
        System.out.println("http://RubénVélezSimón.daw/" + this.hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.numKbytes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LibroDigital other = (LibroDigital) obj;
        return this.numKbytes == other.numKbytes;
    }

    @Override
    public int compareTo(Libro t) {
        if (this.getIsbn() == t.getIsbn()) {
            return 1;
        }
        return -1;
    }

    //Método inventado
    @Override
    public void arrancarPagina() {
        System.out.println("No se puede por que es digital");
    }

}
