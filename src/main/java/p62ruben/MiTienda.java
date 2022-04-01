/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package p62ruben;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ruben
 */
public class MiTienda {

    public static void main(String[] args) {

        //Pregunta2:El toString no es un método polimorfico 
        //porque es un método sobreescrito ya que otras clases la tienen pero con distinto código 
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<SeEnvia> envios = new ArrayList<>();

        productos.add(new Pantalon("xl", "Cualquiera", "0154a", 19.99, 21, "Pantalón vaquero"));
        productos.add(new Pantalon("M", "Otra", "1654e", 30, 21, "Pantalón estrecho"));
        productos.add(new Musica("All that Remains", "6846r", 24.95, 21, "Disco del grupo All that Remains"));
        productos.add(new Musica("Crystal Lake", "6546h", 26.95, 21, "Disco del grupo Crystal Lake"));
        productos.add(new LibroPapel(1346, "6845364", "65463", 30.95, 21, "Libro de Palabras Radiantes"));
        productos.add(new LibroPapel(1548, "654315", "654668", 17.95, 21, "Libro llamado Elantris"));
        productos.add(new LibroDigital(54, "64631", "6874653", 10, 21, "Libro llamado Malaz"));
        productos.add(new LibroDigital(75, "68451361", "658462", 12.50, 21, "Libro llamado Guardias,Guardias"));

        envios.add(new Pantalon("xl", "Cualquiera", "0154a", 19.99, 21, "Pantalón vaquero"));
        envios.add(new Pantalon("M", "Otra", "1654e", 30, 21, "Pantalón estrecho"));
        envios.add(new LibroPapel(1346, "6845364", "65463", 30.95, 21, "Libro de Palabras Radiantes"));
        envios.add(new LibroPapel(1548, "654315", "654668", 17.95, 21, "Libro llamado Elantris"));

        Producto l1 = new LibroPapel(1346, "6845364", "65463", 30.95, 21, "Libro de Palabras Radiantes");

        productos.forEach((n) -> System.out.println(n));
        System.out.println("---------------------------------");
        System.out.println(productos.toString());

        for (Producto producto : productos) {
            if (producto instanceof Libro) {
                //conversion explicita
                libros.add((Libro) producto);
            }
        }

        libros.forEach((n) -> System.out.println(n));
        System.out.println("---------------------------------");
        System.out.println(libros.toString());

        for (Libro libro : libros) {
            if (libro instanceof LibroDigital) {
                //conversion explicita
                ((LibroDigital) libro).descargar();
            }
            if (libro instanceof LibroPapel) {
                //conversion explicita
                ((LibroPapel) libro).enviar("Calle inventada123");
            }
        }
        System.out.println(libros.contains(l1));

        for (SeEnvia envio : envios) {
            envio.enviar("Calle inventada456");
        }

    }
}
