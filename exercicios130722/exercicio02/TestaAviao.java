package br.com.generation.exercicio02;

public class TestaAviao {
	
	// Exercício 02
	/* Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */

	public static void main(String[] args) {
		
		// Objeto cliente
		Aviao av1 = new Aviao();
		
		av1.setModelo("Cessna 172 Skyhawk");
		av1.setCompanhia("Gol");
		av1.setIdade(10);
		
		System.out.println("Dados do avião: ");
		System.out.println("Modelo: " + av1.getModelo());
		System.out.println("Companhia Aérea: " + av1.getCompanhia());
		System.out.println("Idade do avião: " + av1.getIdade() + " anos");

	}

}
