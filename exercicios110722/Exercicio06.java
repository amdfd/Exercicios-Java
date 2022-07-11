package br.com.generation.exercicios110722;

import java.util.Scanner;

public class Exercicio06 {
	
	// Exercício 06
	/* Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE) */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, multiploDeTres = 0, contador = -1;
		
		do {
			
			System.out.println("Digite um número inteiro ou digite 0 para sair: " );
			numero = input.nextInt();
			
			if(numero % 3 == 0) {
				multiploDeTres += numero;
				contador++;
			}		
		} while(numero != 0);
		
		System.out.println("A média dos números múltiplos de três é: " + (multiploDeTres / contador));
		
		input.close();
	}

}
