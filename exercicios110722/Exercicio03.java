package br.com.generation.exercicios110722;

import java.util.Scanner;

public class Exercicio03 {
	
	// Exercício 03
	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =99. (WHILE) */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, idadeMenos21 = 0, idadeMais50 = 0;
		
		while(idade < 99) {
			
			System.out.println("Insira uma idade: ");
			idade = input.nextInt();
			
			if (idade < 21) {
				idadeMenos21++;
			} else if (idade > 50) {
				idadeMais50++;
			}
		}
		
		System.out.println("Programa finalizado.");
		System.out.println("O total de pessoas com menos de 21 anos é: " + idadeMenos21);
		System.out.println("O total de pessoas com mais de 50 anos é: " + idadeMais50);
		
		input.close();

	}

}
