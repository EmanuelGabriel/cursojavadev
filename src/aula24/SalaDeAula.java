package aula24;

public class SalaDeAula {
	
	String aluno;
	static String professor;
	
	
	//criar um m�todo est�tico(static)
	static void ensainar() {
		//m�todo est�ticos(static) s� podem acessar atributos/vari�veis est�ticos(static) e N�O atributos que pertence ao objeto, a inst�ncia
		System.out.println(professor + " ensinando");
		
		
	}
	

}
