/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula12;

/**
 *
 * @author jrpbnt
 */
public class Ave  extends Animal{
    private String cordaPennugem;
    

    @Override
    public void locomover() {
        System.out.println("Voando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");

    }
     
    public static void  FazerNinho(){
        System.out.println("Construiu Ninho");
    }

    public String getCordaPennugem() {
        return cordaPennugem;
    }

    public void setCordaPennugem(String cordaPennugem) {
        this.cordaPennugem = cordaPennugem;
    }
    
}
