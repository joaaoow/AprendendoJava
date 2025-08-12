public class ExercicioDojo_01 {
    public static void main(String[] args) {
         double salario = 99000.0;
         double primeiraTaxa = 9.70 / 100;
         double segundaTaxa = 37.35 / 100;
         double terceiraTaxa = 49.50 / 100;
         if(salario > 0 && salario <= 34712.0){
             double primeiroImposto = salario * primeiraTaxa;
             System.out.println("Salário com imposto: $" + primeiroImposto);
         } else if(salario > 34712.0 && salario <= 68507.0){
             double segundoImposto = salario * segundaTaxa;
             System.out.println("Salário com imposto: $" + segundoImposto);
        } else if(salario > 68507.0){
             double terceiroImposto = salario * terceiraTaxa;
             System.out.println("Salário com imposto: $" + terceiroImposto);
         }
    }
}
