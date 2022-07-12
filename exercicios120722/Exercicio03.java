package br.com.generation.exercicios120722;

import java.util.Scanner;

public class Exercicio03 {
	
	// Exercício 3

	/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int somaN1 = 0, somaN2 = 0;
		
		System.out.println("Digite os valores da matriz N1: ");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				N1[l][c] = input.nextInt();
				somaN1 += N1[l][c];
			}
		}
		
		System.out.println("Digite os valores da matriz N2: ");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				N2[l][c] = input.nextInt();
				somaN2 += N2[l][c];
			}
		}
		
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		
		System.out.println("Resultado da M1: ");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.print(M1[l][c] + " | "); 
			}
		}
		
		System.out.println();
		System.out.println("Resultado da M2: ");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.print(M2[l][c] + " | "); 
			}
		}
		
		input.close();

	}

}
