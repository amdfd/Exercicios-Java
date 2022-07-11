package br.com.generation.exercicios080722;

import java.util.Scanner;

public class Exercicio02 {
	
	// Exercício 2
	/* Faça um programa que entre com três números e coloque em ordem crescente. Só use if, else e else if. */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int primeiroNumero, segundoNumero, terceiroNumero, posicao1 = 0, posicao2 = 0, posicao3 = 0;

		System.out.println("Pense em 3 números diferentes.");
		System.out.println("Insira o primeiro número: ");
		primeiroNumero = input.nextInt();
		System.out.println("Insira o segundo número: ");
		segundoNumero = input.nextInt();
		System.out.println("Insira o terceiro número: ");
		terceiroNumero = input.nextInt();
		
		// Verificando primeira posição
		if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			posicao1 = primeiroNumero;
		} else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero ) {
			posicao1 = segundoNumero;
		} else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
			posicao1 = terceiroNumero;
		}
		
		// Verificando terceira posição
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			posicao3 = primeiroNumero;
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			posicao3 = segundoNumero;
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			posicao3 = terceiroNumero;
		}
		
		// Verificando segunda posição
		if (primeiroNumero != posicao1 && primeiroNumero != posicao3) {
			posicao2 = primeiroNumero;
		} else if (segundoNumero != posicao1 && segundoNumero != posicao3) {
			posicao2 = segundoNumero;
		} else if (terceiroNumero != posicao1 && terceiroNumero != posicao3) {
			posicao2 = terceiroNumero;
		}
		
		System.out.println(posicao1);
		System.out.println(posicao2);
		System.out.println(posicao3);
		
		input.close();

	}

}
