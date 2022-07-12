package br.com.generation.exercicios120722;

import java.util.Scanner;

public class Exercicio02 {
	
	// Exerc�cio 2

	/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] valorDado = new double[10];
		double media = 0.0, soma = 0.0, ocorrencias = 0.0, maiorNumero = 0.0, numeroSorteado = 0.0;
		int min = 1, max = 6;
		
		System.out.println("Os lan�amentos foram: ");
		
		for (int i = 0; i <= 10; i++) {
			numeroSorteado = (int)Math.floor(Math.random()*(max-min+1)+min);
			System.out.print(numeroSorteado + " | ");
			
			soma += numeroSorteado;
			media = soma / 10;
			
			if(numeroSorteado > maiorNumero) {
				maiorNumero = numeroSorteado;
				ocorrencias = 0.0;
			}
			
			if(numeroSorteado == maiorNumero) {
				ocorrencias++;
			}
		}
		
		System.out.println();
		System.out.println("A m�dia dos lan�amentos �: " + media);
		System.out.println("As ocorr�ncias da maior pontua��o foram: " + ocorrencias);
		
		input.close();
	}

}
