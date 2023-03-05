package exercicio05;

import java.util.Scanner;

//Desafio 05 - Industria da Multa
public class exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if (velocidadeAtual <= 60) {
            System.out.print("Nao foi multado");
        } else {
            System.out.print("Foi multado");
        }
    }
}
