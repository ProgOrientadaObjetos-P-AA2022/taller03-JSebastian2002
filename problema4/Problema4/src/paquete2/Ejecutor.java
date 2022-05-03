/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import paquete1.Dispositivos;
/**
 *
 * @author E.N.D
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        Dispositivos dp = new Dispositivos();
        // Valores de entrada
        System.out.println("-----------------------");
        String sistemaoperativo = "Android";
        double tamañopantalla = 7;
        double costoinicial = 400;
        double ivaporcentaje = 19;
        String mac = "d3:asd:8d";
        String imei = "231542141";
        System.out.println("-----------------------");         
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        dp.establecerSistemaoperativo(sistemaoperativo);
        dp.establecerTamañopantalla(tamañopantalla);
        dp.establecerCostoinicial(costoinicial);
        dp.establecerIvaporcentaje(ivaporcentaje);
        dp.establecerMac(mac);
        dp.establecerImei(imei);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        dp.calcularCostofinal();
        dp.calcularIvainicial();

        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
       
    
       System.out.printf("Dispositivos\n\nSistema Operativo: %s\n"
         +"Tamaño Pantalla: %.2f\nCosto Inicial: %.2f\n"
         +"Iva Porcentaje: %.2f\n"+"Direccion mac: %s\n"+"Direccion IMEI: %s\n"+"Iva Inicial: %.2f\n"+"Costo Final: %.2f\n",dp.obtenerSistemaoperativo(),
         dp.obtenertamañopantalla(),dp.obtenerCostoinicial(),dp.obtenerIvaporcentaje(),dp.obtenerMac(),
         dp.obtenerImei(),dp.obtenerIvainicial(),dp.obtenerCostofinal());
}
     
         
     }