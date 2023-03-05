package exercicio01;

import java.util.Scanner;

//Desafio 01 - Mesada do Sobrinho

public class exercicio01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

//        System.out.println("Digite o numero de meses que você polpara o dinheiro: ");
//        int entrada = leitor.nextInt();

        int montanteApurado = mesada * entrada;

        System.out.print(montanteApurado);
//        System.out.print("Voce tera " + montanteApurado + " reais");

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

    }
}
