public class Exercicio_10 {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 4.9;
        double nota3 = 8.1;
        double media;
        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            System.out.println("Média do Aluno: " + media);
            System.out.println("Aluno Aprovado! :)");
        } else{
            System.out.println("Média do Aluno: " + media);
            System.out.println("Aluno Reprovado! :(");
        }
    }
}
