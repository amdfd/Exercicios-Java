package br.com.generation.exercicio01;

public class TestaCliente {
	
	// Exercício 01
	/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

	public static void main(String[] args) {
		
		// Objeto cliente
		
		Cliente cl1 = new Cliente();
		
		cl1.setNome("Ricardo Pereira");
		cl1.setTelefone("11997452015");
		cl1.setEndereco("Rua Piraporinha, 712");

		System.out.println("Dados do Cliente: ");
		System.out.println("Nome: " + cl1.getNome());
		System.out.println("Telefone: " + cl1.getTelefone());
		System.out.println("Endereço: " + cl1.getEndereco());
		
		
	}

}
