/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class EquivalenteHora {

    /**
     * @param args the command line arguments
     */
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public void establecerHoras(int c){
        horas = c;
    }
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    public void calcularSegundos(){
        segundos = horas * 3600;
    }
    public void calcularDias(){
        dias = horas * 1440;
    }
    
    
    public int obtenerHoras(){
        return horas;
    }
    public int obtenerMinutos(){
        return minutos;
    }
    public int obtenerSegundos(){
        return segundos;
    }
    public int obtenerDias(){
        return dias;
    }
   
}
