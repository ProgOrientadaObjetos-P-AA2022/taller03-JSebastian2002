/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Terreno;
/**
 *
 * @author UTPL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        Terreno at = new Terreno();
        // Valores de entrada
        double ancho = 50;
        double largo = 70;
        double valorMetroCuadrado = 20;
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        at.establecerValorMetroCuadrado(valorMetroCuadrado);
        at.establecerAncho(ancho);
        at.establecerLargo(largo);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        at.calcularArea();
        at.calcularCostoterreno();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
          System.out.printf("Costo Terreno\n\nAncho del terreno: %.2f\n"
                +"Largo del terreno: %.2f\n Valor metro cuadrado: %.2f\n"
                +"Costo del Terreno: %.2f\n",at.obtenerAncho(),at.obtenerLargo(),
           at.obtenerValorMetroCuadrado(),at.obtenerCostoterreno());           
     }
     }

    

