import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, soma = 0;//variavel global, consigo fazer um somatório dentro de uma laço para depois tirar esses valor
        for (int i = 1; i < 10; i++){
            System.out.print("Número:");
            n = input.nextInt();
            soma = soma + n; //sobreescreve o N
        }
        System.out.println("Calculo total: " + soma);
    }
}