package br.com.generation.exercicios080722;

import java.util.Scanner;

public class Exercicio04 {
	
	// Exercício 4
	/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		double raiz, potencia;
		
		System.out.println("Insira um número inteiro: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é par.");
			raiz = Math.sqrt(numero);
			System.out.println("A raiz quadrada desse número é: " + raiz);
		} else {
			System.out.println("O número é ímpar.");
			potencia = Math.pow(numero, 2);
			System.out.println("O número elevado ao quadrado é: " + potencia);
		}
		
		input.close();

	}

}
