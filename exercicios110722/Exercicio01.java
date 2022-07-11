package br.com.generation.exercicios110722;

public class Exercicio01 {
	
	// Exercício 01
	/* Informar todos os números de 1000 a 1999 que quando divididos por 11
	 obtemos resto = 5. (FOR) */

	public static void main(String[] args) {
		
		for(int i = 1000; i <= 1999; i++) {
			
			int resultado = i % 11;
			
			if(resultado == 5) {
				System.out.println(i);
			}
		}
	}
}
