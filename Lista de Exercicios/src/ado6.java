import java.util.Scanner;
public class ado6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String nomeAlunoVelho = "";
            int quantAluno = 1;
            int alunoVelho = 0;


            do {
                System.out.println("Digite os dados do aluno " + quantAluno + ":");

                System.out.print("Nome: ");
                String nomeAluno = input.nextLine();

                System.out.print("Idade: ");
                byte idadeAluno = input.nextByte();

                input.nextLine();

                if (idadeAluno > alunoVelho) {
                    alunoVelho = idadeAluno;
                    nomeAlunoVelho = nomeAluno;
                }
                quantAluno++;

            }
            while (quantAluno <= 5);

            System.out.println("O aluno mais velho é: \n");
            System.out.println("Nome: " + nomeAlunoVelho);
            System.out.println("Idade: " + alunoVelho);

            input.close();
        }
    }

