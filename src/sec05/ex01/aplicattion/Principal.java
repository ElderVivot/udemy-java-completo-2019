package sec05.ex01.aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec05.ex01.entities.Trabalhador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// cria um array de trabalhadores
		List<Trabalhador> trabalhador = new ArrayList<>();
		
		// pergunta quantos empregados quer cadastrar
		System.out.print("Digite quantos empregados quer cadastrar: ");
		int n = sc.nextInt();
		
		for( int i = 0; i <n; i++) {
			System.out.println("----------------------------------------");
			System.out.println("Empregado " + (i+1) + ".");
			
			// pega o ID
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			// verifica se o ID já existe
			Trabalhador existe = trabalhador.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if(existe == null) {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Salário Inicial: ");
				double salario = sc.nextDouble();
				
				trabalhador.add(new Trabalhador(id, nome, salario));
			} else {
				System.out.println();
				System.out.print("Trabalhador já existe, informe ou ID.");
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.print("Digite o ID do empregado que deve ser acrescentado o salário: ");
		int idAlterar = sc.nextInt();
		System.out.println();
		
		Trabalhador trab = trabalhador.stream().filter(x -> x.getId() == idAlterar).findFirst().orElse(null);
		if(trab == null) {
			System.out.println("ID inválido (não existe).");
		} else {
			System.out.print("Porcentagem: ");
			double porcentagem = sc.nextDouble();
			trab.aumentaSalario(porcentagem);
		}
		
		System.out.println();
		for( Trabalhador obj : trabalhador ) {
			System.out.println(obj);
		}

	}

}
