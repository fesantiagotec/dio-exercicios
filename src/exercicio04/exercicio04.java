package exercicio04;

import java.util.Scanner;
//Desafio 04 - Lojinha de Doces
public class exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        int quantidadeDoces = dinheiro * 2;

        System.out.print("O cliente obteve " + quantidadeDoces + " doces");

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

    }
}
