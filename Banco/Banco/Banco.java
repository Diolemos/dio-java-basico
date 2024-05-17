package Banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Cliente.Cliente;

public class Banco {
     private List<Cliente> clientes;
     public String nome;
     
   private static final int[] AGENCIAS = {0001, 0002, 0003, 0004, 0005, 0006};

      public Banco(String nome) {
        this.clientes = new ArrayList<>();
        setNome(nome);
        
    }
    public void setNome(String nome) {
        if(nome.length()>=4 && nome.length()<=12 && nome != null){
            this.nome = nome;
        }
        else{
            throw new IllegalArgumentException("Nome precisa ter no mínimo 4 letras e no máximo 12");
        }
    }

    public String getNome(){
        return this.nome;
    }


    public List<Cliente> getClientes() {
        return clientes;
    }

    public int[] getAGENCIAS() {
        return AGENCIAS;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Banco{" + nome +
                " clientes=" + clientes +
                ", Agências=" + Arrays.toString(AGENCIAS) +
                '}';
    }
}
