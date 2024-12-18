package es.educastur.jla02430.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    private void nuevoPrestamo() {
        System.out.println("Identificación del usuario: ");
        int posUsuario = buscaDni(solicitaDni());
        if (posUsuario ==-1) {
            System.out.println("Usuario no encontrado");
        } else {
            System.out.println("Identificación del libro");
            int posLibro = buscaIsbn(solicitaIsbn());
            if (posLibro==-1) {
                System.out.println("No se encuentra el ISBN en el sistema");
            } else if (libros.get(posLibro).getEjemplares()>0){
                LocalDate hoy = LocalDate.now();
                prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
             } else {
                System.out.println("No quedan unidades disponibles");
            }
        }
    }
    
    /**
     * Método para solicitar un DNI
     * @return dni (String)
     */
    
    public String solicitaDni(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el DNI del usuario: ");
        String dni= sc.nextLine();
        return dni;
    }
    
    /**
     * Método para solicitar un ISBN
     * @return isbn (String)
     */
    
    public String solicitaIsbn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el ISBN del usuario: ");
        String isbn= sc.nextLine();
        return isbn;
    }
    
    //<editor-fold defaultstate="collapsed" desc="MÉTODOS AUXILIARES">
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
//</editor-fold>
    
}
