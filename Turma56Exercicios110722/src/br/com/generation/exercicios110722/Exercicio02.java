package br.com.generation.exercicios110722;

import java.util.Scanner;

public class Exercicio02 {
	
	// Exercício 02
	/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0, contador, contadorPar = 0, contadorImpar = 0;
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número inteiro: ");
			numero = input.nextInt();
			
			if(numero % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		System.out.println("Você digitou " + contadorPar + " números pares e " + contadorImpar + " números ímpares.");
		
		input.close();
	}
}
