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
        Dispositivos dp2 = new Dispositivos();
        // Valores de entrada
        System.out.println("-----------------------");
        String sistemaoperativo = "Android";
        double tamañopantalla = 7;
        double costoinicial = 400;
        double ivaporcentaje = 19;
        String mac = "d3:asd:8d";
        String imei = "231542141231";
        System.out.println("-----------------------");         
        
        
        System.out.println("-----------------------");
        String sistemaoperativo2 = "IOS";
        double tamañopantalla2 = 9;
        double costoinicial2 = 550;
        double ivaporcentaje2 = 19;
        String mac2 = "f4:23s:s3";
        String imei2 = "465875686590";
        System.out.println("-----------------------");    
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        dp.establecerSistemaoperativo(sistemaoperativo);
        dp.establecerTamañopantalla(tamañopantalla);
        dp.establecerCostoinicial(costoinicial);
        dp.establecerIvaporcentaje(ivaporcentaje);
        dp.establecerMac(mac);
        dp.establecerImei(imei);
        
        
        dp2.establecerSistemaoperativo(sistemaoperativo2);
        dp2.establecerTamañopantalla(tamañopantalla2);
        dp2.establecerCostoinicial(costoinicial2);
        dp2.establecerIvaporcentaje(ivaporcentaje2);
        dp2.establecerMac(mac2);
        dp2.establecerImei(imei2);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        dp.calcularCostofinal();
        dp.calcularIvainicial();
        
        dp2.calcularCostofinal();
        dp2.calcularIvainicial();

        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
       
    
       System.out.printf("Dispositivos\n\nSistema Operativo: %s\n"
         +"Tamaño Pantalla: %.2f\nCosto Inicial: %.2f\n"
         +"Iva Porcentaje: %.2f\n"+"Direccion mac: %s\n"+"Direccion IMEI: %s\n"+"Iva Inicial: %.2f\n"+"Costo Final: %.2f\n",dp.obtenerSistemaoperativo(),
         dp.obtenertamañopantalla(),dp.obtenerCostoinicial(),dp.obtenerIvaporcentaje(),dp.obtenerMac(),
         dp.obtenerImei(),dp.obtenerIvainicial(),dp.obtenerCostofinal());
       
       
              System.out.printf("Dispositivos\n\nSistema Operativo: %s\n"
         +"Tamaño Pantalla: %.2f\nCosto Inicial: %.2f\n"
         +"Iva Porcentaje: %.2f\n"+"Direccion mac: %s\n"+"Direccion IMEI: %s\n"+"Iva Inicial: %.2f\n"+"Costo Final: %.2f\n",dp2.obtenerSistemaoperativo(),
         dp2.obtenertamañopantalla(),dp2.obtenerCostoinicial(),dp2.obtenerIvaporcentaje(),dp2.obtenerMac(),
         dp2.obtenerImei(),dp2.obtenerIvainicial(),dp2.obtenerCostofinal());
}
     
         
     }