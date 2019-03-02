/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.util;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author programacion
 */
public class ManejadorDeArchivos {
    private PrintWriter escritor;
    private BufferedReader lector;
    
    public ManejadorDeArchivos(String nombre){
        FileWriter escritorDeArchivo = null;
        
        try{
            escritorDeArchivo = new FileWriter(nombre, true);
        }catch(IOException e){
            System.out.println("Error al intentar escribir el archivo");
        }
            escritor = new PrintWriter(escritorDeArchivo, true);
    }
    public void escribir(String texto){
        escritor.println(texto);
    }
}
