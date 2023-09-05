import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //declarar variavel e receber valores
            float p1 = 0.5f, p2 = 0.3f, p3 = 0.2f;
            System.out.println("- Calculo da Média -");

            System.out.println("Nota 1: ");
            float n1 = input.nextFloat();

            System.out.println("Nota 2: ");
            float n2 = input.nextFloat();

            System.out.println("Nota 3: ");
            float n3 = input.nextFloat();


            //declarar variavel e receber valor
            System.out.println(" *- Agora vamos digitar as faltas! -* ");
            System.out.println("Quantas faltas: ");
            float faltas = input.nextFloat();


            float media = ((n1 * p1) + (n2 * p2) + (n3 * p3)); //calculo dos pesos
            if ((media >= 6) && (faltas <= 18)) { // se média for maior que 6 ___E___ menor que 18, executar
                System.out.println("Aprovado!");
                System.out.println("Media: " + media + " com o total de " + faltas + " faltas");
            } else if ((media <= 6 && faltas >= 18)) {  // se média for menor que 6 ___E___ maior que 18, executar
                System.out.println("Reprovado por Média e Faltas");
                System.out.println("Média: " + media);
                System.out.println("Faltas: " + faltas);
            } else if (faltas >= 18) { //se faltas for maior que 18
                System.out.println("Reprovado por faltas");
                System.out.println("Faltas: " + faltas);
            } else { //caso depois de tudo isso, então ele foi reprovado por média
                System.out.println("Reprovado por média!");
                System.out.println("Media: " + media);
            }
    }
}

