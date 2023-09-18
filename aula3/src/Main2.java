import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Códigos do produto: ");
        System.out.println("1 - Alimento Não-perecível");
        System.out.println("2 até 4 - Alimento Perecível");
        System.out.println("5 e 6 - Vestuário");
        System.out.println("7 - Higiene Pessoal");
        System.out.println("8 até 15 - Limpeza e utensílios domésticos");
        for (int i = 0; i <= 2; i++){
            System.out.println(".");
        }

        System.out.print("Digite o código do produto: ");
        int codProduto = input.nextInt();
        switch (codProduto) {
            case 1:
                System.out.println("Alimento Não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento Perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e utensílios domésticos");
                break;
            default:
                System.out.println("Código Invalido!");
        }
    }
}
