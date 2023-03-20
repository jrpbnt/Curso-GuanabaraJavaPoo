/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.uec;

/**
 *
 * @author jrpbnt
 */
public class Lutador {

    private String nome;
    private String Nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
//Metodos publicos

    public void apresentar() {
        System.out.println("--------------------------------");
        System.out.println(" Chegoua a hora! apresentamos o lutador " + this.getNome());
        System.out.println(" Diretamente de  " + this.getNacionalidade());
        System.out.println("com   " + this.getIdade() + "anos e " + this.getAltura());
        System.out.println("pesando   " + this.getPeso() + "kg    ");
        System.out.println("  com  " + this.getVitorias() + "  vitorias  ");
        System.out.println(" e " + this.getDerrotas() + "  Derrotas  ");
        System.out.println(" por ultimo " + this.getEmpates() + " Empates! ");

    }

    public void status() {
        System.out.println(this.getNome() + "e um peso" + this.getCategoria());
        System.out.println("Ganhou" + this.getVitorias() + "Vezes");
        System.out.println("perdeu" + this.getDerrotas() + "Vezes");
        System.out.println("Empatou " + this.getEmpates() + "Vezes");

    }

    public void ganharluta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderluta() {
        this.setDerrotas(this.getDerrotas() - 1);

    }

    public void empatarluta() {
        this.setEmpates(this.getEmpates() + 1);

    }

    //Metodos Especiais
    public Lutador(String nome, String Nacionalidade, int idade, float altura, 
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.Nacionalidade = Nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        if (this.peso < 52.2) {
            this.categoria = "invalido";

        } else if (this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";

        } else {
            this.categoria = "invalido";

        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
