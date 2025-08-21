import java.util.Scanner;
import java.util.Random;
public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int valorAleatorio = gerador.nextInt(100);
        System.out.println("Valor Aleatorio: "+ valorAleatorio);
    }
}
