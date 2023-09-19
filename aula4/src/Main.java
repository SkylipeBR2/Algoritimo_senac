import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de inicio: ");
        int inicio = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o valor de final: ");
        int fim = input.nextInt();


        for (int i = inicio; i< fim; i++){
            if (i%2 == 0){
                System.out.println("Item: " + i);
            }
        }
    }
}