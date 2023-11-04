import java.util.Scanner;

public class soma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int n = 1;
        int nUsuario;
        System.out.print("Digite um número: ");
        nUsuario = input.nextInt();

        while (n <= nUsuario) {
            soma += n;
            n++;
        }
        System.out.println("A soma de de 1 a " + nUsuario + " é igual a: " + soma);
        input.close();
    }
}
