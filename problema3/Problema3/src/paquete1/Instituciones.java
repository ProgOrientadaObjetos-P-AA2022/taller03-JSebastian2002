/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class Instituciones {
    private String nombre;
    private String tipoinstitucion;
    private double numeroalumnos;
    private double numerodocentes;
    private double numerosedes;
    private double gastoestudinates;
    private double presupuesto;  
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipoinstitucion(String c){
        tipoinstitucion = c;
    }
    
    public void establecerNumeroalumnos(double c){
        numeroalumnos = c;
    }
     public void establecerNumerodocentes(double c){
        numerodocentes = c;
    }
     public void establecerNumeroSedes(double c){
        numerosedes = c;
    }
     public void establecerGastoestudiantes(double c){
        gastoestudinates = c;
    }
     
    public void calcularPrespuesto(){
       presupuesto = gastoestudinates * numeroalumnos;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoinstirucion(){
        return tipoinstitucion;
    }
    
    public double obtenerNumeroalumnos(){
        return numeroalumnos;
    }
    
    public double obtenerNumerodocentes(){
        return numeroalumnos;
    }
     public double obtenerNumerosedes(){
        return numerosedes;
    }
    public double obtenerGastoestudinates(){
        return gastoestudinates;
    } 
    public double obtenerPresupuesto(){
        return presupuesto;
    } 
}
