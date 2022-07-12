package br.com.generation.exercicios120722;

import java.util.Scanner;

public class Exercicio01 {
	
	// Exercício 1
	/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] valor = new int[5];
		int maiorValor = 0;
		
		System.out.println("Digite os cinco valores: ");
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Valor número " + (i+1) + ": ");
			valor[i] = input.nextInt();
			
			if(maiorValor < valor[i]) {
				maiorValor = valor[i];
			}
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.print(valor[i] + " | ");
		}
		
		System.out.println();
		System.out.println("O maior valor é: " + maiorValor);
		
		input.close();
	}

}
