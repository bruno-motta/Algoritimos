package br.com.algoritimos.BuscaBinaria;

public class BinarySearch {
    public static int buscaBinaria(int[] array, int valorProcurado){
        int inicio = 0;
        int fim = array.length -1;

        while (inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;

            if(array[meio] == valorProcurado){
                return meio;
            }
            if(array[meio] < valorProcurado){
                inicio =  meio + 1;
            }else{
                fim = meio - 1;
            }
        }

        return -1;
    }
}
