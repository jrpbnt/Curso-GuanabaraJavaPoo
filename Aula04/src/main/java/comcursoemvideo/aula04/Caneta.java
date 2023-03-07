/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula04;

/**
 *
 * @author jrpbnt
 */
public class Caneta {
    public String modelo;
    public float Ponta;
    private String Cor;
    private boolean tampada;
    
    public  Caneta(String m , String c, float p) {
        
        this.modelo = m;
        this.Cor= c;
        this.Ponta =    p;
        
        this.tampar();
        this.Cor = "Azul";
        
    }
    
    public String getModelo() {
        
     return this.modelo;
     
        
    }
       
    public void   SetModelo(String m) {
        this.modelo = m;
        
        
         }
     public float getPonta() {
         return this.Ponta;
         
     }    
         public void setPonta(float p) {
             
         }
         public void status() {
             System.out.println("Sobre A Caneta");
             System.out.println("Modelo" + this.modelo);
             System.out.println("Ponta" + this.Ponta);
             System.out.println("Cor:" + this.tampada);
             System.out.println("tampada" + this.tampada);
             
         }
         public void tampar() {
             this.tampada = true;
             
         }
         public void destampar() {
             this.tampada = false;
             
         }
    }


