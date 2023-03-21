/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula12;

/**
 *
 * @author jrpbnt
 */
public class Peixe extends Animal {
    private String Corescama;
    

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixa não faz som");
    }
    public void soltarbolhas(){
        System.out.println("Soltando bolhas ");
    }

    public String getCorescama() {
        return Corescama;
    }

    public void setCorescama(String Corescama) {
        this.Corescama = Corescama;
    }
    
}
