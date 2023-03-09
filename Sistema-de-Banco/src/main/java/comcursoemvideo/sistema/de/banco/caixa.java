/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.sistema.de.banco;

/**
 *
 * @author jrpbnt
 */
public class caixa {

    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(2124);
        p1.setDono("José Roberto");
        p1.AbrirConta("CC");
        p1.Depositar(200);
        p1.Sacar(250);
        p1.FecharConta();
        p1.EstadoAtual();
        
        
        
        
        

    }

}
