package br.com.generation.exercicios120722;

import java.util.Scanner;

public class Exercicio02 {
	
	// Exercício 2

	/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] valorDado = new double[10];
		double media = 0.0, soma = 0.0, ocorrencias = 0.0, maiorNumero = 0.0, numeroSorteado = 0.0;
		int min = 1, max = 6;
		
		System.out.println("Os lançamentos foram: ");
		
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
		System.out.println("A média dos lançamentos é: " + media);
		System.out.println("As ocorrências da maior pontuação foram: " + ocorrencias);
		
		input.close();
	}

}
