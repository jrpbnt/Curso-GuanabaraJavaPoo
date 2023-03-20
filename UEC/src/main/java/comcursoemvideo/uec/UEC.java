/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package comcursoemvideo.uec;

/**
 *
 * @author jrpbnt
 */
public class UEC {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Luta uec01 = new Luta();
        Lutador l[] = new Lutador[6];
       l[1] = new Lutador("Goiabinha","Minas Gerais",32,1.92f,116,10,0,0);
        
      l[2] = new Lutador("Paulo","India",29,2.15f,110,22,0,0);
    
   
     uec01.marcarluta(l[1], l[2]);
    uec01.lutar();
     
    }
    
}
