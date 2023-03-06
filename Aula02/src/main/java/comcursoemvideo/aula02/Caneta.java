/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula02;

/**
 *
 * @author jrpbnt
 */
public class Caneta {
    String Modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status (){
        System.out.println("Modelo:" + this.Modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Ponta:" +  this.ponta);
        
        System.out.println("carga:" + this.carga);
        System.out.println("está Tampada" + this.tampada);
          
    }
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
            
        } else {
            
            System.out.println("Estou rabiscando");
            
        }
        
        
    }
    void  tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
        
        
    }
    
}


