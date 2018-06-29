package aula023;

/**
 * Utilizando sobrecarda de métodos e construtores
 * @author EMANUEL
 * @version 1.0
 *
 */
public class SobrecargaDeMetodos {
    
	//variáveis/atributos pertence a Classe do Objeto
	String nome;
	int idade;
	
	//sobrecarga de construtor com passasgem de parâmetro 
	public SobrecargaDeMetodos(String nome) {
		this.nome = nome;
	}
	
	//sobrecarga de construtor com passagem de dois parâmetros
	public SobrecargaDeMetodos(String nome, int idade) {
		this(nome); //chamei um construtor que já existe e que recebe uma 'String'
		this.idade = idade;
	}
	
	
	
	//criando um método COM RETORNO para somar dois valores
	int somar(int valor1, int valor2) {
		
		return valor1 + valor2;
		
	}
	
	//sobrecarga de um método, acrescentando mais uma variável - tipo de parâmetros passado
	int somar(int valor1, int valor2, int valor3) {
		
		return this.somar(valor1, valor2);
	}
	
	
	public static void main(String[] args) {
		
		SobrecargaDeMetodos obj = new SobrecargaDeMetodos("Samuel", 23);
		int soma = obj.somar(30,30);
		System.out.println(soma);
		
		System.out.println("Seu nome é ".concat(obj.nome));
		System.out.println(obj.idade);
		

		

	}

}
