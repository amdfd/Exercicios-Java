package br.com.generation.exercicios110722;

import java.util.Scanner;

public class Exercicio04 {
	
	// Exercício 04
	/* Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	- o número de pessoas calmas;
	- o número de mulheres nervosas;
	- o número de homens agressivos;
	- o número de outros calmos;
	- o número de pessoas nervosas com mais de 40 anos;
	- o número de pessoas calmas com menos de 18 anos. */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numeroPessoas = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, nervosoMais40 = 0, calmoMenos18 = 0;
		
		while(numeroPessoas <= 6) {
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();
			
			System.out.println("Digite o número correspondente ao sexo: 1 - Feminino, 2 - Masculino, 3 - Outros");
			int sexo = input.nextInt();
			
			System.out.println("Digite o número correspondente à emoção: 1 - Calmo(a), 2 - Nervoso(a), 3 - Agressivo(a)");
			int emocao = input.nextInt();
			
			numeroPessoas++;
			
			if (emocao == 1) {
				pessoasCalmas++;
			} 
			
			if (sexo == 1 && emocao == 2) {
				mulheresNervosas++;
			} 
			
			if (sexo == 2 && emocao == 3) {
				homensAgressivos++;
			}
			
			if (sexo == 3 && emocao == 1) {
				outrosCalmos++;
			}
			
			if (emocao == 2 && idade > 40) {
				nervosoMais40++;
			} 
			
			if (emocao == 1 && idade < 18) {
				calmoMenos18++;
			}
		}
		
		System.out.println("Questionário finalizado.");
		System.out.println("O número de pessoas calmas é: " + pessoasCalmas);
		System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
		System.out.println("O número de homens agressivos é: " + homensAgressivos);
		System.out.println("O número de outros calmos é: " + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosoMais40);
		System.out.println("O número de pessoas calmas com menos de 18 é: " + calmoMenos18);
		
		input.close();

	}

}
