package br.com.generation.exercicios080722;

import java.util.Scanner;

public class Exercicio03 {
	
	// Exercício 3
	/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra: 
	10-14 infantil
	15-17 juvenil
	18-25 adulto */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("A categoria é infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("A categoria é juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("A categoria é adulto.");
		} else {
			System.out.println("Favor inserir uma idade entre 10 a 25 anos.");
		}
		
		input.close();

	}

}
