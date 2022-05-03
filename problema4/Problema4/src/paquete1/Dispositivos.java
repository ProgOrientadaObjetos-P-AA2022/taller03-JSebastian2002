/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class Dispositivos {
private String sistemaoperativo;
    private double tamañopantalla;
    private double costoinicial;
    private double ivaporcentaje;
    private double ivainicial;
    private double costofinal;
    private String mac;
    private String imei;  

    public void establecerSistemaoperativo(String c){
        sistemaoperativo = c;
    }
    
    public void establecerTamañopantalla(double c){
        tamañopantalla = c;
    }
    
    public void establecerCostoinicial(double c){
        costoinicial = c;
    }
     public void establecerIvaporcentaje(double c){
        ivaporcentaje = c;
    }
     public void calcularIvainicial(){
        ivainicial = costoinicial * 21;
    }
     public void calcularCostofinal(){
        costofinal = costoinicial + ivainicial;
    }
    public void establecerMac(String c){
        mac = c;
    }
        public void establecerImei(String c){
        imei = c;
    }

    public String obtenerSistemaoperativo(){
        return sistemaoperativo;
    }
    public double obtenertamañopantalla(){
        return tamañopantalla;
    }
    public double obtenerCostoinicial(){
        return costoinicial;
    }
     public double obtenerIvaporcentaje(){
        return ivaporcentaje;
    }
    public double obtenerIvainicial(){
        return ivainicial;
    } 
    public double obtenerCostofinal(){
        return costofinal;
    } 
    public String obtenerMac(){
        return mac;
    }
    public String obtenerImei(){
        return  imei;
    }
     
}
