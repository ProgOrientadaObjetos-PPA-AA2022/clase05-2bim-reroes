/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;


public class APINetflix implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
