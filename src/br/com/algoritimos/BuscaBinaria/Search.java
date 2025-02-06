package br.com.algoritimos.BuscaBinaria;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 15, 29 ,9 ,5, 8, 18};
        System.out.println("Escolha um numero de 0 à 6: ");
        int valorProcurado = scanner.nextInt();
        int resultado = BinarySearch.buscaBinaria(array, valorProcurado);

        if(valorProcurado == -1){
            System.out.println("Resultado não encontrado no array");
        }else{
            System.out.println("Valor encontrado na posição: " );
        }

    }
}
