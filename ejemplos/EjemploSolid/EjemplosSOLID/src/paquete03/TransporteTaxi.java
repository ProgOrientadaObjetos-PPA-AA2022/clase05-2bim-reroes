/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteTaxi {
    private String cooperativaTaxi;
    private double tarifa;
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
    
}
