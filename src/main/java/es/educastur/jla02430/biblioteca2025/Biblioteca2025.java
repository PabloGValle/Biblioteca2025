package es.educastur.jla02430.biblioteca2025;

import java.util.ArrayList;

/**
 * Token GitHub: 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
 * Este es el proyecto de la Biblioteca
 * @author Pablo González Valle
 */

public class Biblioteca2025 {
    
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;

    public Biblioteca2025(){
            this.libros = new ArrayList();
            this.usuarios = new ArrayList();
            this.prestamos = new ArrayList();
    }
    
    public static void main(String[] args) {
        Biblioteca2025 b = new Biblioteca2025();
        b.cargaDatos();
        b.menu();
    }   

    private void cargaDatos() {
    }

    private void menu() {
    }
}
