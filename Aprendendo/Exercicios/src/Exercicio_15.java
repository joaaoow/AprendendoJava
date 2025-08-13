import java.util.Scanner;
import java.time.LocalDateTime;
public class Exercicio_15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDateTime agora = LocalDateTime.now();
    System.out.println("Informe o seu ano de nascimento: ");
    int anoNascimento = sc.nextInt();
    int anosVividos = 2025 -  anoNascimento;
    int mesesVividos = anosVividos * 12;
    int diasVividos = mesesVividos * 30;

    System.out.printf("Ano de nascimento: %d", anoNascimento);
    System.out.printf("\nAnos vividos: %d", anosVividos);
    System.out.printf("\nMeses vividos: %d", mesesVividos);
    System.out.println("\nDias vividos: " + diasVividos);

    }
}
