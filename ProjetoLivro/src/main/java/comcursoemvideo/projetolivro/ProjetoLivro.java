/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comcursoemvideo.projetolivro;

/**
 *
 * @author jrpbnt
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("José",15,"m");
        p[1] = new Pessoa("Rafaela",15,"m");
        
        l[0] = new Livro("JoJo's Bizzare Adventure","Hirohiko Araki",312,p[0]);
        l[1] = new Livro("Yu Yu Hakusho","Yoshihiro Togashi" , 215,p[1]);
        l[2] = new Livro("Haikyuuu!!!!","haruichi Furudate",320,p[1]);
        
        l[0].Abrir();
        l[0].folhear(252);
        l[0].avançarPag();
        System.out.println(l[0].Detalhes());
        
        System.out.println(l[1].Detalhes());
        
        
    }
}
