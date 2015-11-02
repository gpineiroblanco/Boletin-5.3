/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg3;

/**
 *
 * @author Toshiba
 */
public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo parida1=new Circulo();
        parida1.setRadio(1);
        System.out.println("Longitud= "+parida1.calcularLongitud());
        System.out.println("Area= "+parida1.calcularArea());
    }
    
}
