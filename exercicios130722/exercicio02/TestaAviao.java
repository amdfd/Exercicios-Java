package br.com.generation.exercicio02;

public class TestaAviao {
	
	// Exerc�cio 02
	/* Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console. */

	public static void main(String[] args) {
		
		// Objeto cliente
		Aviao av1 = new Aviao();
		
		av1.setModelo("Cessna 172 Skyhawk");
		av1.setCompanhia("Gol");
		av1.setIdade(10);
		
		System.out.println("Dados do avi�o: ");
		System.out.println("Modelo: " + av1.getModelo());
		System.out.println("Companhia A�rea: " + av1.getCompanhia());
		System.out.println("Idade do avi�o: " + av1.getIdade() + " anos");

	}

}
