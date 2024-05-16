package Conta;
import java.util.Random;


abstract class Conta{
    int numeroConta ;
    double saldo;



    public Conta(){
        this.saldo = 0.0;

    }



    public void depositar(){
        // TODO: implemente this method
        //this is not abstract to keep app DRY
        System.out.println("depositar");
    }
    public void sacar(double valor){
        saldo -= valor;
        Random random = new Random();
        // TODO: criar um contador e gerar número sequencial de contas
        this.numeroConta = 10000 + random.nextInt(90000);
    }

    public void imprimirExtrato(){
        System.out.println(saldo);
    }
}