package aula24;

public class TiposEstaticos {

	
	public static void main(String[] args) {
	
		SalaDeAula.professor = "Gabriel Francisco";
		SalaDeAula.ensainar();
		
		
		SalaDeAula a1 = new SalaDeAula();
		a1.aluno = "Sousa";
		System.out.println(a1.professor);

		
		//criar outro objeto
		SalaDeAula a2 = new SalaDeAula();
		a2.aluno = "Francisco";
		System.out.println(a2.professor);

	}

}
