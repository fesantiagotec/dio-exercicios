package exercicio02;

import java.util.Scanner;

//Desafio 02 - Download de Pacotes

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        switch(tamanho){
            case 1:
                System.out.print("/");
                break;
            case 2:
                System.out.print("//");
                break;
            case 3:
                System.out.print("///");
                break;
            case 4:
                System.out.print("////");
                break;
            case 5:
                System.out.print("/////");
                break;
            case 6:
                System.out.print("//////");
                break;
            case 7:
                System.out.print("///////");
                break;
            case 8:
                System.out.print("////////");
                break;
            case 9:
                System.out.print("/////////");
                break;
            case 10:
                System.out.print("//////////");
                break;
        }
    }
}
