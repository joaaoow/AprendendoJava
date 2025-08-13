import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Farenheit: ");
        double tempFarenheit = sc.nextDouble();
        double tempCelcius = (5 * (tempFarenheit - 32) / 9);
        System.out.printf("Temperatura em Farenheit: %.2f", tempFarenheit);
        System.out.printf("\nTemperatura em Celcius: %.2f", tempCelcius);
    }
}
