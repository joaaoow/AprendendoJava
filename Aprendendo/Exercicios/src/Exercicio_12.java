import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do produto: R$ ");
        Scanner sc = new Scanner(System.in);
        double valorProduto = sc.nextDouble();
        System.out.println("\nEscolha uma forma de pagamento: ");
        System.out.println("1 - À vista no dinheiro ou pix (15% de desconto)");
        System.out.println("2 - À vista no crédito (10% de desconto)");
        System.out.println("3 - Parcelado em duas vezes (sem juros)");
        System.out.println("4 - Parcelado em três vezes (10% de juros)");
        int formaPagamento = sc.nextInt();
        double valorFinal;
        switch (formaPagamento) {
            case 1:
                valorFinal = valorProduto * 0.85;
                System.out.println("À vista: " + valorFinal);
                break;
            case 2:
                valorFinal = valorProduto * 0.90;
                System.out.printf("À Vista no crédito: " + valorFinal);
                break;
            case 3:
                valorFinal = valorProduto;
                double parcela2x = valorFinal / 2;
                System.out.printf("2x de R$ %.2f (sem juros). Total: %.2f\n", parcela2x, valorFinal);
                break;
            case 4:
                valorFinal = valorProduto * 1.10;
                System.out.printf("Total com 10% de juros: ", valorFinal);
                System.out.print("Quantas vezes deseja parcelar (minímo três)?");
                int parcelas = sc.nextInt();
                if(parcelas >= 3){
                    double valorParcela = valorFinal / parcelas;
                    System.out.printf("%dx de R$ %.2f\n", parcelas, valorParcela);
                } else{
                    System.out.print("Número de parcelas inválido, deve ser três ou mais");
                }
                break;
            default:
                System.out.println("Essa opção não existe!");
                break;
        }
    }
}
