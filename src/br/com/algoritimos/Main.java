package br.com.algoritimos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tamanho terá o array: ");
        int tamanho = scanner.nextInt();
        int[] array= new int[tamanho];

        for(int i = 0;  i < tamanho; i++ ){
            System.out.println("Entre com os valores no array");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int valor : array){ //Valor recebe os valores adc em array. ForEach.
            System.out.println("Valor: " + valor);
        }

        scanner.close();
    }
}