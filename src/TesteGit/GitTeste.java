package TesteGit;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GitTeste {

	public static void main(String[] args) {
		
		String Aluno = "Aluno";
		
		List<Double> notas = new ArrayList<>();
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 5 notas: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nota do aluno: " + (i+1));
			notas.add(sc.nextDouble());
			
			
		}
		List<Double> todasNotas = notas; 
		double Soma = 0;
		
		for(Double a: notas) {
			Soma += a;
		}
		System.out.println("Notas de todos os alunos somadas: " + todasNotas );
		System.out.println("Soma de todas as notas: " + Soma);
		
		
	}

}
