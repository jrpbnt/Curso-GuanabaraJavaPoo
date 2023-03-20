/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.projetopessoa;

/**
 *
 * @author jrpbnt
 */
public class Aluno  extends Pessoa {
    private int mat;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("Matricula sera cancelada");

    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
