/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.aula011;

/**
 *
 * @author jrpbnt
 */
public class Bolsista  extends Aluno{
    
    private float Bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de" + this.nome);
        
    }
    
    @Override
    public void pagarmensalidade() {
        System.out.println(this.nome + "é bolsista Pagamento Facilitado ");
        
    }

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }
    
}
