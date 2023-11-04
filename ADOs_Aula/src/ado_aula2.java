import java.util.Scanner;

public class ado_aula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = input.nextInt();
        System.out.println("Os Números ímpares de 1 até " + x + " são: ");
        for (int i = 1; i <= x; i+=2) {
            System.out.println(i);
        }
        input.close();

    }
    
}
