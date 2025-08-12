public class Exercicio_07 {
    public static void main(String[] args) {
        boolean maiorDeIdade;
        boolean menorDeIdade;
        int idade = 19;
        maiorDeIdade = idade >= 18;
        menorDeIdade = idade < 18;
        if(maiorDeIdade){
            System.out.println("Maior de idade, pode entrar na festa :)");
        } else if(menorDeIdade){
            System.out.println("Menor de Idade, não pode entrar na festa :(");
        }
    }
}
