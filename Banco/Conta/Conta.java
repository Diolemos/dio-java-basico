package Conta;
import java.util.Random;


abstract class Conta{
    int numeroConta ;
    double saldo;
    double SAQUE_MINIMO = 10.0;



    public Conta(){
        this.saldo = 0.0;
        Random random = new Random();
        // TODO: criar um contador e gerar número sequencial de contas
        this.numeroConta = 10000 + random.nextInt(90000);
    }



    public void depositar(double valor){
        if(valor <0.01 ){
            throw new IllegalArgumentException("Por favor, insira um valor de depósito");
        }else{
            saldo += valor;
        }
       
    }
    public void sacar(double valor){
       if(valor > saldo  ){
        throw new IllegalArgumentException("Saldo insuficiente");
       }else if(valor < SAQUE_MINIMO ){
        throw new IllegalArgumentException("Saque mínimo de 10 reais");
       }else{
        saldo -= valor;
       }
       
      
    }

    public void imprimirExtrato(){
        System.out.println(saldo);
    }

    public Integer getNumeroConta(){
        return this.numeroConta ;
    }

    public double getSaldo(){
        return this.saldo;
    }

}