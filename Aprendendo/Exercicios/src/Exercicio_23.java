import java.util.Scanner;
public class Exercicio_23 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    //Input de valores a serem calculados para descobrir o salário liquido
        System.out.println("Informe o valor da hora aula: ");
        double horaAula = sc.nextDouble();
        System.out.println("Informe o número de aulas lecionadas: ");
        double aulas = sc.nextDouble();
        double desconto;
    //Cálculo Salario Base
        double salarioBase = aulas * 4.5 * horaAula;
        System.out.println("Salário Base: " + salarioBase);
    //Cálculo Hora Atividade
        double horaAtividade = salarioBase * 0.05;
        System.out.println("Hora Atividade: " + horaAtividade);
    //Cálculo DSR(Descanso Semanal Remunerado)
        double dsrFinal = (salarioBase + horaAtividade) / 6;
        System.out.println("DSR: " + dsrFinal);
    //Cálculo Salário Bruto
        double salarioBruto = salarioBase + horaAtividade + dsrFinal;
        System.out.println("Salário Bruto: " + salarioBruto);

    //Cálculo do salário líquido de acordo com o desconto do INSS
    double descontoINSS;
        if(salarioBruto <= 1.518){
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2.794) {
            descontoINSS = salarioBruto * 0.09;
        } else if (salarioBruto <= 4.190) {
            descontoINSS = salarioBruto * 0.12;
        } else{
            descontoINSS = salarioBruto * 0.14;
        }

    //Cálculo Salário Líquido
        double salarioLiquido = salarioBruto - descontoINSS;

    //Desconto INSS e Salário Líquido
        System.out.printf("Desconto INSS: %.2f", descontoINSS);
        System.out.printf("\nSalário Liquido: %.2f", salarioLiquido);
    }
}
