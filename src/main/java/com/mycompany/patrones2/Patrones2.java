/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.patrones2;

/**
 *
 * @author Miguel
 */
public class Patrones2 {

    public static void main(String[] args) 
    {
        Formateador<Double> d = new Formateador<Double>(51235.43);
        System.out.println(d.formatear());
    }
}
