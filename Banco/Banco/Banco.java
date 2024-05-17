package Banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Cliente.Cliente;

public class Banco {
     private List<Cliente> clientes;
     
   private static final int[] AGENCIAS = {0001, 0002, 0003, 0004, 0005, 0006};

      public Banco() {
        this.clientes = new ArrayList<>();
        
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
        return "Banco{" +
                "clientes=" + clientes +
                ", Agências=" + Arrays.toString(AGENCIAS) +
                '}';
    }
}
