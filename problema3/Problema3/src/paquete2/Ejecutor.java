/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Instituciones;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        Instituciones in = new Instituciones();
        // Valores de entrada
       System.out.println("----------------");
       String nombre = "Universidad de Columbia";
       String tipoinstitucion = "Privada";
       double numeroalumnos = 300;
       double numerodocentes = 215; 
       double numerosedes = 400;
       double gastoestudinates = 46.500 ;
       System.out.println("----------------");
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        in.establecerNombre(nombre);
        in.establecerTipoinstitucion(tipoinstitucion);
        in.establecerNumeroalumnos(numeroalumnos);
        in.establecerNumerodocentes(numerodocentes);
        in.establecerNumeroSedes(numerosedes);
        in.establecerGastoestudiantes(gastoestudinates);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        in.calcularPrespuesto();
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
       System.out.printf("Insituciones\n\nNombre: %s\n"
         +"tipo Institucion: %s \nCantidad de alumnos: %.2f\n"
         +"Cantidad de docentes: %.2f\n"+"Cantidad de Sedes: %.2f\n"
         +"Gasto de estudiantes: %.2f\n"+"Presupuesto: %.2f\n",in.obtenerNombre(),in.obtenerTipoinstirucion(),in.obtenerNumeroalumnos(),
         in.obtenerNumerodocentes(),in.obtenerNumerosedes(),in.obtenerGastoestudinates(),in.obtenerPresupuesto());
}
     
         
     }
    
