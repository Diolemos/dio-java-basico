import Banco.Banco;
import Cliente.Cliente;

public class Main{
    public static void main(String[] args) {
        
        Banco Santander = new Banco("Santander");

        Cliente JosePereira = new Cliente("José Pereira", "01/10/1988", "12345678953", Santander.getAGENCIAS()[0]);
        Cliente EmaelOliveira = new Cliente("Emael Oliveira", "24/09/1965", "32165498715" , Santander.getAGENCIAS()[1]);
        Cliente EnzoSampaio = new Cliente("Enzo Sampaio","08/04/2009", "32112365445" ,Santander.getAGENCIAS()[2]);

        Santander.adicionarCliente(EnzoSampaio);
        Santander.adicionarCliente(EmaelOliveira);
        Santander.adicionarCliente(JosePereira);

        Santander.getClientes();
        System.out.println(Santander);




    }
}