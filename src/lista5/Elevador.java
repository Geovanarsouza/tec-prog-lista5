package lista5;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeElevador;
	private int quantidadePessoas;
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual=andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares=totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador=capacidadeElevador;
	}
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas=quantidadePessoas;
	}
	
	
	
	public void Inicializa(int capacidadeElevador,int totalAndares) {
		andarAtual=0;
		quantidadePessoas=0;
	}
	public void Entra() {
		if(quantidadePessoas<capacidadeElevador) {
			quantidadePessoas++;
		}
	}
	public void Sai() {
		if(quantidadePessoas>=1) {
			quantidadePessoas--;
		}
	}
	public void Sobe() {
		if(andarAtual<totalAndares) {
			andarAtual++;
		}
	}
	public void Desce() {
		if(andarAtual>0) {
			andarAtual--;
		}
	}
	
}
