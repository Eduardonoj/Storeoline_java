/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.sistema;

import java.util.Date;
import org.eduardolopez.bean.Book;
import org.eduardolopez.exception.ValidarException;
import org.eduardolopez.util.ManejadorDeArchivos;

/**
 *
 * @author programacion
 */
public class Principal {

    public static void main(String args[]) {
        try {
            String authors[] = {"Juan Perez", "Julio Martinez"};
            Book lista[] = new Book[5];
            lista[0] = new Book("Book1", new Date(), "Editorial 1", authors);
            lista[1] = new Book("Book2", new Date(), "Editorial 2", authors);
            lista[2] = new Book("Book3", new Date(), "Editorial 3", authors);
            lista[3] = new Book("Book4", new Date(), "Editorial 4", authors);
            lista[4] = new Book("Book5", new Date(), "Editorial 5", authors);
            lista[0].setIsbn("1111");
            lista[1].setIsbn("2222");
            lista[2].setIsbn("3333");
            lista[3].setIsbn("4444");
            lista[4].setIsbn("5555");
            
            imprimirLibros(lista);
            guardarInformacion(lista);
        } catch (ValidarException e) {
            System.out.println("Error:" + e.getMessage());
        }finally{//este siempre se ejecuta exista o no exista una exception o excepsion
        
        }
    }

    public static void imprimirLibros(Book[] libros) throws ValidarException {
        try {
            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i]);
            }
        } catch (Exception e) {
            throw new ValidarException();
        }
    }
    
    public static void guardarInformacion(Book[] libros){
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("books.txt");
        for(int i = 0; i < libros.length; i++){
            manejador.escribir(libros[i].toString());
        
        }
    }
}
