package aula25;

import pacoteteste.Animal;

public class Principal {

	public static void main(String[] args) {
		
		//inst�nciando o objeto - Pessoa
		Pessoa p = new Pessoa("Jo�o da Silva Borges");
		p.setSenhaDobanco(3461.91);
		
		System.out.println("Nome: ".concat(p.nome));
		System.out.println(p.getSenhaDobanco());
		
		
		
		
		
		//criando o objeto Animal
		Animal obj = new Animal();
		System.out.println(obj.tipo);
		
		obj.tipo = "Cachorro";
		obj.getNumeroConta();
		System.out.println(obj.getNumeroConta());
		

	}

}
