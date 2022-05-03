/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.EquivalenteHora;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        EquivalenteHora hr = new EquivalenteHora();
        EquivalenteHora hr2 = new EquivalenteHora();
        // Valores de entrada
        System.out.println("----------------");
        int horas = 2;
        System.out.println("Horas"+":"+horas);
         System.out.println("----------------");
         
         
        System.out.println("----------------");
        int horas2 = 10;
        System.out.println("Horas"+":"+horas2);
        System.out.println("----------------");
         
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        hr.establecerHoras(horas);
        hr2.establecerHoras(horas2);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        hr.calcularMinutos();
        hr.calcularSegundos();
        hr.calcularDias();
        
        
        hr2.calcularMinutos();
        hr2.calcularSegundos();
        hr2.calcularDias();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
       
    
       System.out.printf("Conversion\n\nCantidad de Horas: %d\n"
         +"Conversion Horas a Minutos: %d \nConversion Horas a segundos: %d\n"
         +"Conversion Horas a diass: %d\n",hr.obtenerHoras(),hr.obtenerMinutos(),
         hr.obtenerSegundos(),hr.obtenerDias());
       
           
       System.out.printf("Conversion\n\nCantidad de Horas: %d\n"
         +"Conversion Horas a Minutos: %d \nConversion Horas a segundos: %d\n"
         +"Conversion Horas a diass: %d\n",hr2.obtenerHoras(),hr2.obtenerMinutos(),
         hr2.obtenerSegundos(),hr2.obtenerDias());
}
     
         
     }
    

