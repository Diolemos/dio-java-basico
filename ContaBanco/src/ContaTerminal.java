import java.util.Scanner;
import java.util.Random;


public class ContaTerminal {
    public static void main(String[] args)throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        double min = 0.10;
        double max = 100000.0;
     //TODO exibir mensagens para o usuário
        String logo = 
        "          __       __        __                         __       \n" +
        "         |  \\     |  \\      |  \\                       |  \\      \n" +
        "  ______ | $$ ____| $$      | $$____   ______  _______ | $$   __ \n" +
        " /      \\| $$/      $$      | $$    \\ |      \\|       \\| $$  /  \\\n" +
        "|  $$$$$$| $|  $$$$$$$      | $$$$$$$\\ \\$$$$$$| $$$$$$$| $$_/  $$\n" +
        "| $$  | $| $| $$  | $$      | $$  | $$//      $| $$  | $| $$   $$ \n" +
        "| $$__/ $| $| $$__| $$      | $$__/ $|  $$$$$$| $$  | $| $$$$$$\\ \n" +
        " \\$$    $| $$\\$$    $$      | $$    $$\\$$    $| $$  | $| $$  \\$$\\\n" +
        "  \\$$$$$$ \\$$ \\$$$$$$$       \\$$$$$$$  \\$$$$$$$\\$$   \\$$\\$$   \\$$\n" +
        "                                                                 \n" +
        "                                                                 \n" +
        "                                                                 ";
System.out.println("\nWelcome to Old Bank's account creation! \n");
System.out.println(logo);
System.out.println("Please, type in your full name: ");
String  nomeCliente = scan.nextLine();
System.out.println("Here you get to chose your accout number \n Plese type your account number:\n");
int numero = scan.nextInt();
scan.nextLine(); //Consume the newline character
System.out.println("\nType your desired Old Bank branch (ex 067-8)");
String agencia = scan.nextLine();



double saldo  = min + (max - min) * random.nextDouble();




     //TODO Exibir mensagem da conta criada

        System.out.println("\nHello, "+ nomeCliente + " . Thank you for creating you Old Bank account!\n Your branch is : "+ agencia +  " and your account number is "+ numero +" . ");
        System.out.printf("Your account ballance ( %.2f ) is ready for withdrawal." , saldo);


    }
}
