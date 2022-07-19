/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones2;

/**
 *
 * @author Miguel
 */
public class Formateador<T> 
{
    private T numero;

    public Formateador(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }
    
    public String formatear()
    {
        String[] x = numero.toString().split("[.]");  
         String format = "";
        
        if(x.length == 2)
        {
            format = "," + x[1];
        }        
        
        char[] xVector = x[0].toCharArray();
        
        int contador = 0;
        
        for (int i = xVector.length -1; i >= 0; i--) 
        {
            if(contador == 3)
            {
                format = "." + format;
                contador = 0;
            }            
            contador++;
            format = xVector[i] + format;            
        }
        
        return format;
    }
    
}
