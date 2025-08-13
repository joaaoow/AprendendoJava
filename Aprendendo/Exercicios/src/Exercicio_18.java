import java.util.Scanner;
public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturaFrancisco = 150;
        double alturaSara = 110;

        double crescimentoFrancisco = 2;
        double crescimentoSara = 3;

        int ano = 0;
        while(alturaFrancisco >= alturaSara){
            alturaFrancisco += crescimentoFrancisco;
            alturaSara += crescimentoSara;

            ano++;
        }
        System.out.println("Serão necessários " + ano + " anos para Francisco ser maior que Sara.");
        System.out.printf("Após %d anos:\n", ano);
        System.out.printf("Altura de Francisco: %.2f cm\n", alturaFrancisco);
        System.out.printf("Altura de Sara: %.2f cm\n", alturaSara);
    }
}
