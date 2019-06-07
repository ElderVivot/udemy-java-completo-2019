package sec05.ex01.entities;

public class Trabalhador {
	
	private int id;
	private String nome;
	private double salario;
	
	public Trabalhador(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		salario += (porcentagem * salario / 100);  
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario); 
	}

}
