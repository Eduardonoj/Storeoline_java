/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.exception;

/**
 *
 * @author programacion
 */
public class ValidarException extends Exception{
    @Override
    public String getMessage(){
        return "Indice fuera del alcance del vector";
    }
    
}
