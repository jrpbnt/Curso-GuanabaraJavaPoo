/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comcursoemvideo.projetopessoa;

/**
 *
 * @author jrpbnt
 */
public class ProjetoPessoa {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
    
        p1.setNome("pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
    }
    
}
