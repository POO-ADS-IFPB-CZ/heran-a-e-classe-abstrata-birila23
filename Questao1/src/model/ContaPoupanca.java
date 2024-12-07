package model;

public class ContaPoupanca {
    public ContaPoupanca(int numero, String nomeTitular) {
        super(numero, nomeTitular);
    }

    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }

}
