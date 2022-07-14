package br.com.generation.exercicios01e02;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaReinoAnimal t = new TestaReinoAnimal();
		
		System.out.println("O cachorro se chama Bidu e tem 2 anos.");
		t.fazerAnimal(new Cachorro());
		
		System.out.println();
		
		System.out.println("O cavalo se chama Cavalo de Fogo e tem 7 anos.");
		t.fazerAnimal(new Cavalo());
		
		System.out.println();
		
		System.out.println("A preguiça se chama Flecha e tem 5 anos.");
		t.fazerAnimal(new Preguiça());

	}

}
