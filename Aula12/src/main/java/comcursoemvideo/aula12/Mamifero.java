/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula12;

/**
 *
 * @author jrpbnt
 */
public class Mamifero extends Animal {
private String CorPelo;

    @Override
    public void locomover() {
                System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
            System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo;
    }
    
}
