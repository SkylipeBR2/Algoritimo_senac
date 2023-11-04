import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int contador = 1;
    String nomeAlunoVelho = "";
    int alunoVelho = 0; 

    do {
        System.out.println("Digite os dados do aluno " + contador + ":");

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Idade: ");
        byte idade = input.nextByte();

        input.nextLine();

        // System.out.println("Sexo: ");
        //String sexo = input.nextLine();

        if (idade > alunoVelho) {
            alunoVelho = idade;
            nomeAlunoVelho = nome;
        }
        contador++;
    } while (contador <= 5);
    
        System.out.println("--Dados do aluno mais velho--");
        System.out.println("Nome: " + nomeAlunoVelho);
        System.out.println("Idade: " + alunoVelho);
       // System.out.println("Sexo: " + sexoAluno);

        input.close();
    }
}

