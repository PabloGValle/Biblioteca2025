package es.educastur.jla02430.biblioteca2025;

import java.util.ArrayList;

/**
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
    
    //<editor-fold defaultstate="collapsed" desc="METODOS AUXILIARES"
    
    /**
     * Método para buscar un Dni en la colección usuarios
     * @param dni dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el ArrayList, -1 si no se encuentra
     */
    
    public int buscaDni(String dni) {
        int pos = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getDni().equals(dni)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    /**
     * Método para buscar un Isbn en la colección libros 
     * @param isbn isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro en el ArrayList, -1 si no encuentra
     */
    
    public int buscaIsbn(String isbn) {
        int pos = -1;
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getIsbn().equals(isbn)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

}
