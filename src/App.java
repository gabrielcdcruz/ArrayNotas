import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas nota deseja informar: ");
        int n = sc.nextInt();
        double[] notasAluno = new double[n];

        System.out.println("------------------------------");

        for (int i = 0; i < notasAluno.length; i++) {
            System.out.printf("Digite %d nota do aluno: ", i + 1);
            notasAluno[i] = sc.nextDouble();
        }

        System.out.println("------------------------------");
        double soma = 0.0;
        for (double notas : notasAluno) {
            soma += notas;
        }
        double media = soma / notasAluno.length;
        System.out.printf("A media do aluno é de: %.2f", media);

    }
}
