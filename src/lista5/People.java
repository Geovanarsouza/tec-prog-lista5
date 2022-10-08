package lista5;
/*Criar a classe Pessoa com as seguintes características:
● atributos: idade e dia, mês e ano de nascimento, nome da pessoa
● métodos: o calculaIdade(), que recebe a data atual em dias, mês e anos
e calcula e armazena no atributo idade a idade atual da pessoa o
informaIdade(), que retorna o valor da idade o informaNome(), que
retorna o nome da pessoa o ajustaDataDeNascimento(), que recebe dia,
mês e ano de nascimento como parâmetros e preenche nos atributos
correspondentes do objeto.
● Criar dois objetos da classe Pessoa, um representando Albert Einstein
(nascido em 14/3/1879) e o outro representando Isaac Newton (nascido
em 4/1/1643)
● Fazer uma classe principal que instancie os objetos, inicialize e mostre
quais seriam as idades de Einstein e Newton caso estivessem vivos.*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class People {
	private int idade;
	private int dia;
	private int mês;
	private int anoDeNascimento;
	private String nome;
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setData(int dia,int mês,int anoDeNascimento) {
		this.anoDeNascimento=anoDeNascimento;
		this.dia=dia;
		this.mês=mês;
		this.idade=idade;
	}
	public void getData() {
	}
	
	public int calculaIdade(int diaAtual,int mêsAtual,int anoAtual) {
		idade=0;
		if(anoAtual>this.anoDeNascimento) {
			if(this.mês==mêsAtual) {
				if(this.dia>diaAtual) {
					this.idade=anoAtual-this.anoDeNascimento-1;
				}
				if(this.dia<=diaAtual) {
					this.idade=anoAtual-this.anoDeNascimento;
				}
			}
			if(this.mês>mêsAtual) {
				this.idade=anoAtual-this.anoDeNascimento-1;
			}
			if(this.mês<mêsAtual) {
				this.idade=anoAtual-this.anoDeNascimento;
			}
		}
		return this.idade;
	}
	public int informaIdade() {
		return this.idade;
	}
	public String informaNome() {
		return this.nome;
	}
	public void ajustaDataDeNascimento(int dia,int mês,int ano) {
		this.anoDeNascimento=ano;
		this.dia=dia;
		this.mês=mês;
	}
}
