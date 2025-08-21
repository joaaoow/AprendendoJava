import java.util.Scanner;
public class Exercicio_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int num2 = sc.nextInt();
        int resultadoDivisao = num1 / num2;
        int restoDivisao = num1 % num2;

        System.out.println("Quociente divisão: " +resultadoDivisao);
        System.out.println("Resto divisão: " +restoDivisao);
    }
}
