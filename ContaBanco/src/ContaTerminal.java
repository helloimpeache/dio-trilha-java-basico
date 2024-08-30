import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //-----------------------------------------------------------
        //VAR DECLARATION
        //-----------------------------------------------------------

        double balance = 0;
        String clientName = "", agency = "";
        int number = 0;

        Scanner scanner = new Scanner(System.in);

       //-----------------------------------------------------------

        //-----------------------------------------------------------
        //MAIN
        //-----------------------------------------------------------

        System.out.println("---------------------------------- Conta ----------------------------------");
        
        System.out.println("Digite seu nome:");
        clientName = scanner.nextLine();

        //-----------------------------

        System.out.println("Por favor, digite o número da agência: ");
        number = scanner.nextInt();
        scanner.nextLine();

        //-----------------------------

        System.out.println("Digite o código da agência:");
        agency = scanner.nextLine();
        
        //-----------------------------

        System.out.println("Por gentileza, digite o saldo atual: ");
        balance = scanner.nextDouble();

        //-----------------------------------------------------------

        //-----------------------------------------------------------
        //OUTPUT
        //-----------------------------------------------------------

        System.out.println("Olá, " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo de R$" + balance + " já está disponível para saque." );
        
        //-----------------------------------------------------------

        scanner.close();



    }
}
