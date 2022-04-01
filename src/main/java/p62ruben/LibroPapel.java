/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62ruben;

/**
 *
 * @author ruben
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, int iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas, String isbn) {
        super(isbn);
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "LibroPapel{" + "numPaginas=" + numPaginas + '}' + "\n";
    }

    @Override
    public void enviar(String dir) {
        System.out.println("El libro se ha enviado a " + dir);
    }

    @Override
    public int compareTo(Libro t) {

        if (this.getIsbn() == t.getIsbn()) {
            return 1;
        }
        return -1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.numPaginas;
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
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
    }

    //Método inventado
    @Override
    public void arrancarPagina() {
        System.out.println("Has arrancado una página");
    }

}
