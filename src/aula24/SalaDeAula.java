package aula24;

public class SalaDeAula {
	
	String aluno;
	static String professor;
	
	
	//criar um método estático(static)
	static void ensainar() {
		//método estáticos(static) só podem acessar atributos/variáveis estáticos(static) e NÃO atributos que pertence ao objeto, a instância
		System.out.println(professor + " ensinando");
		
		
	}
	

}
