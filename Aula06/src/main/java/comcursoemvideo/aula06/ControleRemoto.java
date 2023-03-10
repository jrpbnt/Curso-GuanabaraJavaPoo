/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula06;

/**
 *
 * @author jrpbnt
 */
public class ControleRemoto implements Controlador {

    //Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Métodos Abstratos 

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
             System.out.println("-------Menu--------");
        System.out.println("Está ligado  " + this.isLigado());
        System.out.println("Está Tocando " + this.tocando);
        System.out.println("volume:" + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
       
        }else{
            System.out.println("Impossivel Abrir menu");
            
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()) {
             System.out.println("  Fechando Menu.....");
        }else {
            System.out.println("Não é possivel Fechar Menu");
        }
       

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);

        } else {
            System.out.println("Impossivel aumentar volume");
        }

    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);

        } else {
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);

        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);

        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);

        } else {
            System.out.println("Não consegui Repodruzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(false);

        } else {
            System.out.println("Não consegui pausar");
        }

    }
}
