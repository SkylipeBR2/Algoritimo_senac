import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numPri = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numSeg = input.nextInt();

        for (byte i = 0; i <= 2; i++){
            System.out.println(".");
        }

        System.out.println("Códigos das operações: ");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença entre os números");
        System.out.println("3 - Produtos entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        for (int i = 0; i <= 2; i++){
            System.out.println(".");
        }

        System.out.print("Digite o código da operação: ");
        byte codOperacao = input.nextByte();
        switch (codOperacao) {
            case 1:
                float media = (numPri + numSeg) / 2;
                System.out.println("A Média deles é: " + media);
                break;
            case 2:
                int dif = (numPri - numSeg);
                System.out.println("A Diferença entre eles é: " + dif);
                break;
            case 3:
                int mult = (numPri * numSeg);
                System.out.println("A multiplicação entre eles é: "+ mult);
                break;
            case 4:
                float div = (numPri / numSeg);
                System.out.println("Divisão do primeiro para o segundo é: " + div);
                break;
            default:
                System.out.println("Operação Invalido!");
        }
    }
}
