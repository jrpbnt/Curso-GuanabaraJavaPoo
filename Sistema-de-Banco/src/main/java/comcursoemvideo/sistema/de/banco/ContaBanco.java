/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comcursoemvideo.sistema.de.banco;

/**
 *
 * @author jrpbnt
 */
public class ContaBanco {
//Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float Saldo;
    private boolean status;
//Métodos Personalizados
    
  public void EstadoAtual() {
      System.out.println("BANCO DO ROBERTO");
      System.out.println("---------------------------------");
      System.out.println("Conta: " +  this.getNumConta());
      System.out.println("tipo:" + this.getTipo());
      System.out.println("Dono:" + this.getDono());
      System.out.println("saldo:" + this.getSaldo());
      System.out.println("Status:" + this.isStatus());
      System.out.println("----------------------------------------");
  }  
    

    public void AbrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);

        } else if (t.equals("Cp")) {
            this.setSaldo(150);

        }
    }

    public void FecharConta() {
        
    //    if (this.getSaldo() > 0) {
    //        System.out.println("Conta n pode ser fechada pois ainda ha dinheiro nela");
    //    } else if (this.getSaldo() < 0) {
     //       System.out.println("Conta n pode ser fechada pois está em debito");
     //   } else {
     //       this.setStatus(false);
      //      System.out.println("Conta Fechada Com sucesso");

     //   }
     
          if(this.getSaldo() > 0){
              System.out.println("Conta n pode ser fechada pois ainda ha dinheiro nela");
          }
          
          if(this.getSaldo() < 0){
              System.out.println("Conta n pode ser fechada pois está em debito");
          }
          
          if(this.getSaldo() == 0){
              this.setStatus(false);
              System.out.println("Conta Fechada Com sucesso");
          }

    }

    public void Depositar(float v) {

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito Realizado com sucesso Na conta " + this.getDono());

        } else {
            System.out.println("Impossivel Depositar em uma conta fechada");

        }

    }

    public void Sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado Com sucesso na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        System.out.println("Impossivel Sacar de uma Conta fechada!");

    }

    public void PagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;

        } else if (this.getTipo() == "Cp") {
            v = 20;

        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossivel pagar de uma conta fechada!");

        }
    }

    //Metodos Especiais
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
