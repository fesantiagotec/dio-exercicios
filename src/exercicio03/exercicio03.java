package exercicio03;

import java.util.Scanner;
//Desafio 03 - Leitura da Gertrudes
public class exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int tempoTotalLerLivro = paginas/paginasLidas;

        System.out.print(tempoTotalLerLivro + " dias");

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    }
}
