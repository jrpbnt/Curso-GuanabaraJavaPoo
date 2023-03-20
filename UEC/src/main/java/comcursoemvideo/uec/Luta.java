/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.uec;

import java.util.Random;

/**
 *
 * @author jrpbnt
 */
public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Publicos
    public void marcarluta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiado = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("###Desafiado##");
            this.desafiado.apresentar();
            System.out.println("###Desafiante##");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarluta();
                    break;

                case 1:
                    System.out.println("Vitoria do" + this.desafiado.getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;

                case 2:
                    System.out.println("Vitoria do" + this.desafiante.getNome());
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
            }

        } else {
            System.out.println("A Luta Não Pode Acontecer");

        }

    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
 
}
