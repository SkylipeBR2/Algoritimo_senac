import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a priemira nota do aluno: ");
        int grade1 = input.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        int grade2 = input.nextInt();
        int media = (grade1 + grade2) / 2;

            if (media > 9 && media < 10){
                media = 'A';
            } else if (media >=8){
                media = 'B';
            } else if (media >=7){
                media = 'C';
            } else if (media >=6){
                media = 'D';
            } else {
                media = 'E';
            }
                switch (media) {
                    case 'A':
                        System.out.println("Sua nota foi A, Excelente!");
                        break;
                    case 'B':
                    case 'C':
                        System.out.println("Sua nota foi B/C, Bem Feito!");
                        break;
                    case 'D':
                        System.out.println("Sua nota foi D, Você passou!");
                        break;
                    case 'E':
                        System.out.println("Sua nota foi E, Melhor tentar novamente!");
                        break;
                    default:
                        System.out.println("Conceito Invalido!");
                }
            }
    }
