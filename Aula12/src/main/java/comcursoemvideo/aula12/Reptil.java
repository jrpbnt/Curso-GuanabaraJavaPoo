/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula12;

/**
 *
 * @author jrpbnt
 */
public class Reptil extends Animal {
    private String Corescama;    

    public String getCorescama() {
        return Corescama;
    }

    public void setCorescama(String Corescama) {
        this.Corescama = Corescama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som Réptil");
    }
    
    
    
}
