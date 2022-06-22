package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade3 {
	
	//Colete a quantidade de alunos de uma turma
	//Colete o nome de cada um
	//Colete a média do aluno para cada trimestre de cada matéria, ou seja 4 notas para cada materia, para cada um dos 4 periodos do ano
	//As materias podem estar fixa no código fonte, não precisa seguir um padrão de quantidade de materias e nomes especificos para cada uma delas
	
	//Diga se o aluno está aprovado, reprovado ou em recuperação
	//Como funciona nossa metrica
	//Aprovado média 7
	//Recuperação média >= 6,25 e <= 6.99
	//Reprovado < 6,25
	
	//Você deve usar concatenação, variáveis String, int e double
	//deve usar if, swtich, array e looping for
	
	//concluindo a atividade subir ela para seu repositório do Git
	//cada Aluno poderá ter seu código analisado em uma call privada depois da aula (de forma randon)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de alunos na turma");
		int qtdalunos = sc.nextInt();
		String[] nomealuno = new String[qtdalunos];
		  double[] hist = new double[5];
		  double[] mat = new double[5]; 
		  double[] fis = new double[5];
		for(int cont = 0; cont < qtdalunos; cont++) {
			System.out.println("Nome do(a)" + (cont + 1) + "º aluno(a): ");
			nomealuno[cont] = sc.next();
			/*double[] hist = new double[5];*/
			for(int cont2 = 1; cont2 <= 4; cont2++) {
				System.out.println("Média do " + cont2 + "º trimestre de " + nomealuno[cont] + " em história");
				hist[cont2] = sc.nextDouble();
				if (hist[cont2] < 0) {
					System.out.println("A nota não pode ser menor que 0");
					hist[cont2] = hist[cont2] - 1;
				} 
			}
			/*double[] mat = new double[5];*/
			for(int cont2 = 1; cont2 <= 4; cont2++) {
				System.out.println("Média do " + cont2 + "º trimestre de " + nomealuno[cont] + " em matemática");
				mat[cont2] = sc.nextDouble();
				if (mat[cont2] < 0) {
					System.out.println("A nota não pode ser menor que 0");
					mat[cont2] = mat[cont2] - 1;
				}
			}
			/*double[] fis = new double[5];*/
			for(int cont2 = 1; cont2 <= 4; cont2++) {
				System.out.println("Média do " + cont2 + "º trimestre de " + nomealuno[cont] + " em física");
				fis[cont2] = sc.nextDouble();
				if (fis[cont2] < 0) {
					System.out.println("A nota não pode ser menor que 0");
					fis[cont2] = fis[cont2] - 1;
				}
			}
			double media = 0.0;
			for(int cont2 = 0; cont2 <= 4; cont2++) {
				media = media + hist[cont2] + mat[cont2] + fis[cont2];
			}
			System.out.println("Média anual de " + nomealuno[cont] + " é " + media/12);
			if ((media / 12) >= 7) {
				System.out.println("Situação: Aprovado");
			} else if ((media / 12) >= 6.25 && (media / 12) <= 6.99) {
				System.out.println("Situação: Recuperação");
			} else {
				System.out.println("Situação: Reprovado");
			}
		}

		
	}

}
