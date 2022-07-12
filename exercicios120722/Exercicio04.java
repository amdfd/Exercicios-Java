package br.com.generation.exercicios120722;

import java.util.Scanner;

public class Exercicio04 {
	
	// Exercício 4

	/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal. 
		
	Bônus: também mostre o maio valor da matriz. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0, numeroMaior = 0;
		
		System.out.println("Digite os valores da matriz: ");
		for (int l = 0; l <= 2; l++) {
			for (int c = 0; c <= 2; c++) {
				matriz[l][c] = input.nextInt();
				soma += matriz [l][c];
				
				if(matriz[l][c] > numeroMaior){
					numeroMaior = matriz[l][c];
				}
			}
		}
		
		somaDiagonal += matriz[0][0] + matriz [1][1] + matriz [2][2];
		System.out.println("O maior valor da matriz é: " + numeroMaior);
		System.out.println("A soma dos valores da matriz é: " + soma);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);
		
		input.close();

	}

}
