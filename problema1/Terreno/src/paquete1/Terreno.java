/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void calcularCostoterreno(){
        costo_terreno =  valorMetroCuadrado* area;
    }
    public void establecerAncho(double c){
        ancho = c;
    }
    public void establecerLargo(double c){
        largo = c;
    }
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    public void calcularArea(){
        area = largo*ancho;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
     public double obtenerLargo(){
        return largo;
    }
    public double obtenerarArea(){
        return area;
    }
    
    
}
