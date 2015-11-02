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
public class Circulo {
    
    private double radio;
    private static final double PI = 3.14;
    
    public Circulo () {
        
    }
    
    public Circulo (double r) {
        radio = r;       
    }
    
    public double getRadio (){
        return radio;
    }
    public void setRadio (float r) {
        radio=r;
    }
    public double calcularArea (){
       double area = (Math.pow(radio,2))*PI;
       return area;   
    }
    public double calcularLongitud () {
        double longitud = 2*radio*PI;
        return longitud;
    }
}
