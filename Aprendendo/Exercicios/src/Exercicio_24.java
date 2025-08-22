import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Coletando informações de tempo, velocidade media, distancia percorrida e quantidade de litros usados
        System.out.println("Informe o tempo gasto na viagem: ");
        double tempo = sc.nextDouble();
        System.out.println("\nInforme a velocidade média da viagem: ");
        double velocidade = sc.nextDouble();
        sc.close();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia/ 12;
        System.out.printf("Quantidade de litros utilizados na viagem: %.2f", litrosUsados);
    }
}
