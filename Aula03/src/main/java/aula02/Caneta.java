/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author jrpbnt
 */
public class Caneta {
    public String Modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    void status (){
        System.out.println("Modelo:" + this.Modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Ponta:" +  this.ponta);
        
        System.out.println("carga:" + this.carga);
        System.out.println("está Tampada" + this.tampada);
          
    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
            
        } else {
            
            System.out.println("Estou rabiscando");
            
        }
        
        
    }
    protected void  tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
        
        
    }
    
}


