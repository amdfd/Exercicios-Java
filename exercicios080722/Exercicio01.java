package br.com.generation.exercicios080722;

import java.util.Scanner;

public class Exercicio01 {
	
	// Exercício 1
	/* Faça um programa que receba três inteiros e diga qual deles é o maior. */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, terceiroNumero, maiorNumero = 0;
		
		System.out.println("Insira o primeiro número: ");
		primeiroNumero = input.nextInt();
		System.out.println("Insira o segundo número: ");
		segundoNumero = input.nextInt();
		System.out.println("Insira o terceiro número: ");
		terceiroNumero = input.nextInt();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			maiorNumero = primeiroNumero;
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			maiorNumero = segundoNumero;
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			maiorNumero = terceiroNumero;
		}
		
		System.out.println("O maior número é: " + maiorNumero);
		
		input.close();

	}

}
