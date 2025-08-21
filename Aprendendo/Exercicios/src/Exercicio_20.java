import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero que deseja ser multiplicado: ");
        int numMultiplicado = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", numMultiplicado, i, numMultiplicado*i);
        }
    }
}
