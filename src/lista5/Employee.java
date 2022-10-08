package lista5;

import java.util.Iterator;

/*5. A fim de representar empregados em uma firma, crie uma classe chamada
Empregado. Esta classe deverá possuir as informações a seguir:
a. id
b. primeiro nome
c. sobrenome
d. salário mensal
e. um vetor de booleano que representa os dias trabalhados. Caso o dia
foi trabalho é marcado na posição do vetor como true, caso não foi
trabalho e marcado falso
Sua classe deve ter os seguintes construtores.
● Para receber o nome e sobrenome do empregado
● Para receber o nome e sobrenome do empregado além do id.
Sua classe deve poder calcular o salário do empregado, mediante a
seguinte regra.
● O total de dias trabalhados for igual a 30 o salário será o salário
base total com acréscimo de 1% do salário base
● O total de dias trabalhados for entre 25 a 27 dias para cada dia
não trabalhado o empregado terá o desconto no seu sálario 2%
em relação ao seu salário base
● O total de dias trabalhados for entre 20 a 24 dias para cada dia
não trabalhado o empregado terá o desconto no seu salário de
3% em relação ao seu salário base
● O total de dias trabalhados for menor que 20 o usuário receberá
apenas 20% do seu salário base*/
public class Employee {
	//atributos
	private int id;
	private String firstName;
	private String surname;
	private float monthlySalary;
	private boolean []vetDays=new boolean[30];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public float getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(float monthlySalary) {
		this.monthlySalary=monthlySalary;
	}
	public boolean[] getVetDays() {
		return vetDays;
	}
	public void setVetDays(boolean []vetDays) {
		this.vetDays=vetDays;
	}

	//construtores
	public Employee(String firstName,String surname ) {
		this.firstName=firstName;
		this.surname=surname;
	}
	public Employee(String firstName,String surname, int id) {
		this.firstName=firstName;
		this.surname=surname;
		this.id=id;
	}
	public void calculateSalary(){
		int cont=0;
		for (boolean b : vetDays){
			if(b==true) {
				cont++;
			}
		}
		if(cont==30) {
			monthlySalary+=monthlySalary*0.01;
		}
		if(cont>=25 && cont <=27){
			monthlySalary-=monthlySalary*0.02;
		}
		if(cont>=20 && cont <=24){
			monthlySalary-=monthlySalary*0.03;
		}
		if(cont<20){
			monthlySalary=(float) (monthlySalary*0.20);
		}
	}
}
