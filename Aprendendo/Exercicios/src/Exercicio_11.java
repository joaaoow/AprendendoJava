public class Exercicio_11 {
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 7;
        double nota3 = 5;
        double media = (nota1 + nota2 + nota3) / 3;
        String nomeAluno = "João Pedro";
        if(media >= 7) {
            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("Media do Aluno: " + media);
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("Media do Aluno: " + media);
            System.out.println("Aluno Reprovado!");
        }

    }
}
