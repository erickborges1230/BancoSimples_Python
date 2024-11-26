
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String titular = sc.nextLine();
        System.out.println("Com qual valor iremos iniciar sua conta:");
        float saldo = sc.nextFloat();
        Banco_simples bc = new Banco_simples(titular, saldo);

        while (true){
            System.out.println("Digite uma das opções abaixo?");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - saldo");
            System.out.println("4 - sair");
            int x = sc.nextInt();
            if(x == 1){
                System.out.println("Quanto você quer depositar?");
                float value = sc.nextFloat();
                bc.depositar(value);
            } else if (x == 2) {
                System.out.println("Quanto você quer sacar?");
                float value = sc.nextFloat();
                bc.sacar(value);
            } else if (x == 3) {
                bc.getSaldo();
            }else {
                break;
            }
        }

    }
}