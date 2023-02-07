package edu.thayza.exercicios_arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 4, 78, -41, 6, 95, 2 };

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println("A ordem inversa do vetor é " + vetor[i]);
        }
    }
}
