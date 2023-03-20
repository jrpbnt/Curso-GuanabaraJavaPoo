/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.projetolivro;

/**
 *
 * @author jrpbnt
 */
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int PagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String Detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", \n totPaginas=" + totPaginas
                + ", PagAtual=" + PagAtual + ", \naberto=" + aberto + ", \nleitor=" + leitor.getNome() +
                ", \naberto=" + aberto + ", \nidade=" + leitor.getIdade() + 
                ", \naberto=" + aberto + ", \nSexo=" + leitor.getSexo() + '}';
                
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.PagAtual = 0;

        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return PagAtual;
    }

    public void setPagAtual(int PagAtual) {
        this.PagAtual = PagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void Abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.totPaginas = 0;
            
        }else {
          this.PagAtual = p;  
        }
        

    }

    @Override
    public void avançarPag() {
        this.PagAtual++;

    }

    @Override
    public void voltarPag() {
        this.PagAtual--;

    }

}
 